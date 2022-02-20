package com.amocrm.amocrmsdk.services;

import com.amocrm.amocrmsdk.client.AbstractService;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.UnsortedCollection;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;
import com.amocrm.amocrmsdk.queries.unsorteds.*;

import java.util.Map;

public class UnsortedService extends AbstractService {

    public UnsortedService(AmoApiClient amoApiClient) { super(amoApiClient); }

    public UnsortedsCreateQuery create(Unsorted unsorted, String type) {
        return new UnsortedsCreateQuery(getClient(), unsorted, type);
    }

    public UnsortedsCreateQuery create(UnsortedCollection unsorteds, String type) {
        return new UnsortedsCreateQuery(getClient(), unsorteds, type);
    }

    public UnsortedsGetOneQuery get(String uid) {
        return new UnsortedsGetOneQuery(getClient(), uid);
    }

    public UnsortedsGetQuery get() {
        return new UnsortedsGetQuery(getClient());
    }

    public UnsortedsSummaryQuery summary() {
        return new UnsortedsSummaryQuery(getClient());
    }

    public UnsortedsAcceptQuery accept(String uid) {
        return new UnsortedsAcceptQuery(getClient(), uid);
    }

    public UnsortedsDeclineQuery accept(String uid, Map<String, Integer> body) {
        return new UnsortedsDeclineQuery(getClient(), uid, body);
    }

    public UnsortedsDeclineQuery decline(String uid) {
        return new UnsortedsDeclineQuery(getClient(), uid);
    }

    public UnsortedsDeclineQuery decline(String uid, Map<String, Integer> body) {
        return new UnsortedsDeclineQuery(getClient(), uid, body);
    }

    public UnsortedsLinkQuery link(String uid) {
        return new UnsortedsLinkQuery(getClient(), uid);
    }
}
