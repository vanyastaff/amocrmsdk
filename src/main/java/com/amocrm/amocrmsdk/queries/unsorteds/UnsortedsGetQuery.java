package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.LeadsCollection;
import com.amocrm.amocrmsdk.collections.UnsortedCollection;
import com.amocrm.amocrmsdk.exceptions.ApiException;
import com.amocrm.amocrmsdk.exceptions.ApiNotFoundException;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.filters.UnsortedFilter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class UnsortedsGetQuery extends AbstractQueryBuilder<UnsortedsGetQuery, UnsortedCollection> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     */
    public UnsortedsGetQuery(AmoApiClient client) {
        super(client, "api/v4/leads/unsorted/", UnsortedCollection.class);
        setAuth(client.getAuth());
    }

    /**
     * Set query "page" parameter
     * @param value number of page
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsGetQuery page(Integer value) {
        return unsafeParam("page", value);
    }

    /**
     * Set query "page" parameter
     * @param value number of items default is 50, max is 250
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsGetQuery limit(Integer value) {
        if(value > 250) throw new IllegalArgumentException("Limit value can't be greater that 250");
        return unsafeParam("limit", value);
    }

    /**
     * Set query "filter" parameter
     * @param value a reference to this {@code UnsortedFilter} object
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsGetQuery filter(UnsortedFilter value) {
        HashMap<String, Object> filterQuery = value.buildQueryMap();
        if(filterQuery.size() > 0) return unsafeParam("filter", filterQuery);
        return this;
    }

    /**
     * Set query "filter" parameter
     * @param value array data of filter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsGetQuery filter(HashMap value) {
        return unsafeParam("filter", getGson().fromJson(getGson().toJson(value), UnsortedFilter.class).buildQueryMap());
    }

    /**
     * Set query "order" parameter
     * @param attr sort attribute, possible only "created_at" or "updated_at"
     * @param sort sort direction
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UnsortedsGetQuery order(String attr, String sort) {
        if(!Arrays.asList(new String[]{"created_at", "updated_at"}).contains(attr))
            throw new IllegalArgumentException("Invalid order attribute parameter");
        if(!Arrays.asList(new String[]{"asc", "desc"}).contains(sort))
            throw new IllegalArgumentException("Invalid order sort parameter");

        return unsafeParam("order", new HashMap<String, String>().put(attr, sort));
    }

    @Override
    public UnsortedCollection execute() throws ClientException, ApiException {
        UnsortedCollection unsorteds;
        try {
            unsorteds = super.execute();
        } catch (ApiNotFoundException e) {
            return new UnsortedCollection();
        }
        return unsorteds;
    }

    @Override
    protected UnsortedsGetQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
