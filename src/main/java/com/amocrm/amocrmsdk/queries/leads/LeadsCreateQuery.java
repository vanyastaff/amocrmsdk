package com.amocrm.amocrmsdk.queries.leads;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.LeadsCollection;
import com.amocrm.amocrmsdk.exceptions.ApiException;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.amocrm.amocrmsdk.objects.lead.response.LeadCreateResponse;
import com.google.gson.reflect.TypeToken;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class LeadsCreateQuery extends AbstractQueryBuilder<LeadsCreateQuery, Collection> {

    private static final Logger LOG = LoggerFactory.getLogger(LeadsCreateQuery.class);

    private static final String ENDPOINT_URI = "/api/v4/leads";
    private static final String CONTENT_TYPE = "application/json";

    private String body;

    /**
     * Create a AbstractQueryBuilder instance that can be used to build api request for create new lead
     * @param client Amo API client
     * @param lead lead object
     */
    public LeadsCreateQuery(AmoApiClient client, Lead lead) {
        super(client, ENDPOINT_URI, new TypeToken<Collection<LeadCreateResponse>>() {}.getType());
        setAuth(client.getAuth());
        setBody(lead);
    }

    /**
     * Create a AbstractQueryBuilder instance that can be used to build api request for create new leads
     * @param client Amo API client
     * @param collection lead object
     */
    public LeadsCreateQuery(AmoApiClient client, LeadsCollection collection) {
        super(client, ENDPOINT_URI, new TypeToken<Collection<LeadCreateResponse>>() {}.getType());
        setAuth(client.getAuth());
        setBody(collection);
    }

    /**
     * Create json object from data to pass post data
     * @param object data
     */
    protected void setBody(Lead object) {
        object.requestId(object.hashCode());
        body = getGson().toJson(Arrays.asList(object));
    }

    protected void setBody(Collection<Lead> object) {
        body = getGson().toJson(object.stream().map(lead -> lead.requestId(lead.hashCode())).collect(Collectors.toList()));
    }

    public String getBody() {
        return body;
    }

    /**
     * Override method to use post request
     * @return
     * @throws ClientException
     */
    @Override
    public String executeAsString() throws ClientException {
        try {
            if(StringUtils.isNoneEmpty(body)) {
                String params = mapToGetString(build());
                return getTransportClient().post(getUrl(), params ,body, CONTENT_TYPE).getContent();
            }
            return getTransportClient().post(getUrl(), mapToGetString(build()), null, CONTENT_TYPE).getContent();
        } catch (IOException e ) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new ClientException("I/O exception");
        }
    }

    @Override
    public LeadsCollection execute() throws ClientException, ApiException {
         Collection<LeadCreateResponse> response = super.execute();
         LeadsCollection leads = getGson().fromJson(getBody(), LeadsCollection.class);
         LeadsCollection collection = new LeadsCollection();
         response.stream().forEach(leadCreateResponse -> {
            Optional<Lead> optionalLead = leads.byHash(leadCreateResponse.requestId());
            if(optionalLead.isPresent() && optionalLead.get().hashCode() == leadCreateResponse.requestId()) {
                optionalLead.get().requestId(null);
                collection.add(optionalLead.get());
            }
         });
         return collection;
    }

    @Override
    protected LeadsCreateQuery getThis() {
        return this;
    };

    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
