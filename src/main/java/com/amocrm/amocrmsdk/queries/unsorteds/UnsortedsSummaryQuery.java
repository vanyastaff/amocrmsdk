package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.filters.UnsortedFilter;
import com.amocrm.amocrmsdk.objects.unsorted.responses.UnsortedSummary;

import java.util.Collection;
import java.util.HashMap;

public class UnsortedsSummaryQuery extends AbstractQueryBuilder<UnsortedsSummaryQuery, UnsortedSummary> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     */
    public UnsortedsSummaryQuery(AmoApiClient client) {
        super(client, "api/v4/leads/unsorted/summary", UnsortedSummary.class);
        setAuth(client.getAuth());
    }

    /**
     * Set query "filter" parameter
     * @param value a reference to this {@code UnsortedFilter} object
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsSummaryQuery filter(UnsortedFilter value) {
        HashMap<String, Object> filterQuery = value.buildQueryMap();
        if(filterQuery.size() > 0) return unsafeParam("filter", filterQuery);
        return this;
    }

    /**
     * Set query "filter" parameter
     * @param value array data of filter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsSummaryQuery filter(HashMap value) {
        return unsafeParam("filter", getGson().fromJson(getGson().toJson(value), UnsortedFilter.class).buildQueryMap());
    }

    @Override
    protected UnsortedsSummaryQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
