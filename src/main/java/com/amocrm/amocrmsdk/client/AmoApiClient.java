package com.amocrm.amocrmsdk.client;

import com.amocrm.amocrmsdk.httpclient.HttpTransportClient;
import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.amocrm.amocrmsdk.objects.base.FilterValue;
import com.amocrm.amocrmsdk.serializers.CustomFieldAdapter;
import com.amocrm.amocrmsdk.serializers.FilterValueAdapter;
import com.amocrm.amocrmsdk.services.AccountService;
import com.amocrm.amocrmsdk.services.LeadService;
import com.amocrm.amocrmsdk.services.UnsortedService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AmoApiClient {
    private static final String API_ADDRESS = "https://amocrm.ru/";

    private static final String OAUTH_ENDPOINT = "https://amocrm.ru/";

    private static final int DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT = 3;

    private TransportClient transportClient;

    private Auth auth;

    private Gson gson;

    private String apiEndpoint;

    private String oauthEndpoint;

    private int retryAttemptsInternalServerErrorCount;

    public AmoApiClient() {
        this(null, new HttpTransportClient(), DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT);
    }

    public AmoApiClient(Auth auth) {
        this(auth, new HttpTransportClient(), DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT);
    }

    public AmoApiClient(Auth auth, TransportClient transportClient, int retryAttemptsInternalServerErrorCount) {
        this.transportClient = transportClient;
        this.auth = auth;
        this.gson = getGson();
        this.retryAttemptsInternalServerErrorCount = retryAttemptsInternalServerErrorCount;

        if (auth != null) {
            apiEndpoint = "https://" + auth.getDomainUrl() + "/";
            oauthEndpoint = "https://" + auth.getDomainUrl() + "/";
        } else {
            apiEndpoint = API_ADDRESS;
            oauthEndpoint = OAUTH_ENDPOINT;
        }
    }

    public Auth getAuth() { return auth; }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public Gson getGson() {
        if(gson == null)
            gson = new GsonBuilder().disableHtmlEscaping()
                .registerTypeAdapter(CustomField.class, new CustomFieldAdapter())
                .registerTypeAdapter(FilterValue.class, new FilterValueAdapter())
                .create();
        return gson;
    }

    public int getRetryAttemptsInternalServerErrorCount() {
        return retryAttemptsInternalServerErrorCount;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public String getOAuthEndpoint() { return oauthEndpoint; }

    public AccountService account() {return  new AccountService(this); }

    public LeadService leads() {
        return new LeadService(this);
    }

    public UnsortedService unsorteds() { return new UnsortedService(this); }

}
