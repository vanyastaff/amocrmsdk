package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;

import java.lang.reflect.Type;
import java.util.Collection;

public class UnsortedsLinkQuery extends AbstractQueryBuilder<UnsortedsLinkQuery, Unsorted> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     * @param uid uid of unsorted
     */
    public UnsortedsLinkQuery(AmoApiClient client, String uid) {
        super(client, "api/v4/leads/unsorted/"+ uid +"/link", Unsorted.class);
        setAuth(client.getAuth());
    }

    /**
     * Get reference to this object
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Override
    protected UnsortedsLinkQuery getThis() {
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
