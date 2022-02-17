package com.amocrm.amocrmsdk.client;

import com.amocrm.amocrmsdk.exceptions.ApiException;
import com.amocrm.amocrmsdk.exceptions.ApiServerException;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.exceptions.ExceptionMapper;
import com.amocrm.amocrmsdk.objects.base.Error;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.http.Header;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ApiRequest<T> {

    private static final Logger LOG = LoggerFactory.getLogger(ApiRequest.class);

    private AmoApiClient amoApiClient;

    private TransportClient client;

    private Gson gson;

    private String url;

    private Type responseClass;

    private int retryAttempts;

    private Header[] headers = new Header[0];

    public ApiRequest(String url, TransportClient client, Gson gson, int retryAttempts, Type responseClass) {
        this.client = client;
        this.url = url;
        this.responseClass = responseClass;
        this.gson = gson;
        this.retryAttempts = retryAttempts;
    }

    public ApiRequest<T> setHeaders(Header[] headers) {
        if (headers != null) {
            this.headers = headers;
        }

        return this;
    }

    protected Header[] getHeaders() {
        return this.headers;
    }

    public String getUrl() {
        return url;
    }

    protected Gson getGson() {
        return gson;
    }

    protected TransportClient getTransportClient() {
        return client;
    }

    public Type getResponseClass() {
        return responseClass;
    }

    public T execute() throws ApiException, ClientException {
        ApiServerException exception = null;
        for (int i = 0; i < retryAttempts; i++) {
            try {
                return executeWithoutRetry();
            } catch (ApiServerException e) {
                LOG.warn("API Server error", e);
                exception = e;
            }
        }

        throw exception;
    }

    private T executeWithoutRetry() throws ClientException, ApiException {
        String textResponse = executeAsString();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("title") && json.has("detail")) {
            Error error;
            try {
                error = gson.fromJson(json, Error.class);
            } catch (JsonSyntaxException e) {
                LOG.error("Invalid JSON: " + textResponse, e);
                throw new ClientException("Can't parse json response");
            }

            ApiException exception = ExceptionMapper.parseException(error);

            LOG.error("API error", exception);
            throw exception;
        }

        JsonElement response = json;
        if (json.has("_embedded")) {
            List<String> keys = json.getAsJsonObject("_embedded").entrySet()
                    .stream()
                    .map(i -> i.getKey())
                    .collect(Collectors.toCollection(ArrayList::new));
            response = json.getAsJsonObject("_embedded").getAsJsonArray(keys.get(0));
        }

        json = null;

        try {
            Type type = new TypeToken<T>() {}.getType();
            T result = gson.fromJson(response, responseClass);
//            if (result instanceof Validable) {
//                try {
//                    Validable validable = (Validable) result;
//                    validable.validateRequired();
//                } catch (RequiredFieldException e) {
//                    throw new ClientException("JSON validate fail: " + textResponse + "\n" + e.toString());
//                } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
//                    throw new ClientException("JSON validate fail:" + textResponse + e.toString());
//                }
//            }
            response = null;
            return result;
        } catch (JsonSyntaxException e) {
            throw new ClientException("Can't parse json response: " + textResponse + "\n" + e.toString());
        }
    }

    public String executeAsString() throws ClientException {
        ApiResponse response;
        try {
            response = client.get(url, getBody(), getHeaders());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }

        Map<String, String> headers = response.getHeaders();

        if (!headers.containsKey("Content-Type")) {
            throw new ClientException("No content type header");
        }

        String contentType = headers.get("Content-Type");

        if (!contentType.contains("application/hal+json") && !contentType.contains("application/problem+json")) {
            throw new ClientException("Invalid content type");
        }

        return response.getContent();
    }

    public ApiResponse executeAsRaw() throws ClientException {
        try {
            return client.post(url, getBody());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }
    }

    protected abstract String getBody();
}
