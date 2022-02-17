package com.amocrm.amocrmsdk.client;

import java.util.Map;

public class ApiResponse {
    private int statusCode;

    private String content;

    private Map<String, String> headers;

    public ApiResponse(int statusCode, String content, Map<String, String> headers) {
        this.statusCode = statusCode;
        this.content = content;
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
