package com.amocrm.amocrmsdk.client;

public abstract class AbstractService {
    private AmoApiClient amoApiClient;

    public AbstractService(AmoApiClient amoApiClient) {
        this.amoApiClient = amoApiClient;
    }

    protected AmoApiClient getClient() {
        return this.amoApiClient;
    }
}
