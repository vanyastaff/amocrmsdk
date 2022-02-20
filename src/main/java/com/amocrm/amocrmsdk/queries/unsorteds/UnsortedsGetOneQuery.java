package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;

import java.util.Collection;

public class UnsortedsGetOneQuery extends AbstractQueryBuilder<UnsortedsGetOneQuery, Unsorted> {
    /**
     * Create a AbstractQueryBuilder instance that can be used to build api request for get lead by identifier with various parameters
     * @param client Amo API client
     * @param uid identifier of unsorted
     */
    public UnsortedsGetOneQuery(AmoApiClient client, String uid) {
        super(client, "api/v4/leads/unsorted/"+ uid, Unsorted.class);
        setAuth(client.getAuth());
    }

    /**
     * Get reference to this object
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Override
    protected UnsortedsGetOneQuery getThis() {
        return this;
    }

    /**
     * Get list of required parameter names
     *
     * @return list of names
     */
    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
