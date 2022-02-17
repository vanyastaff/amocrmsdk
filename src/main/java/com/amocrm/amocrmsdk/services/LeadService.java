package com.amocrm.amocrmsdk.services;

import com.amocrm.amocrmsdk.client.AbstractService;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.filters.LeadsFilter;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.amocrm.amocrmsdk.queries.leads.LeadsCreateQuery;
import com.amocrm.amocrmsdk.queries.leads.LeadsGetQuery;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Objects;

public class LeadService extends AbstractService {

    public LeadService(AmoApiClient amoApiClient) {
        super(amoApiClient);
    }

    public LeadsCreateQuery create(Lead lead) {
        return new LeadsCreateQuery(getClient(), lead);
    }

    public void createComplex() {}

    /**
     * Get one lead of account by id with specific endpoint.
     *
     * @param id lead id
     * @return AbstractQueryBuilder
     */
    public LeadsGetQuery find(Integer id) {
        return new LeadsGetQuery(getClient(), id);
    }

    /**
     * Get leads of account
     *
     * @return AbstractQueryBuilder
     */
    public LeadsGetQuery get() {
        return new LeadsGetQuery(getClient());
    }

    /**
     * Get leads of account with filter array  {@code LeadsFilter}
     *
     * @return AbstractQueryBuilder
     */
    public LeadsGetQuery filter(HashMap filter) {
        Gson gson = getClient().getGson();
        LeadsFilter leadsFilter = gson.fromJson(gson.toJson(filter), LeadsFilter.class);
        return new LeadsGetQuery(getClient()).filter(leadsFilter);
    }

    /**
     * Get leads of account with filter reference {@code LeadsFilter}
     *
     * @return AbstractQueryBuilder
     */
    public LeadsGetQuery filter(LeadsFilter filter) {
        return new LeadsGetQuery(getClient()).filter(filter);
    }

    public void link() {}

    public void unlink() {}
}
