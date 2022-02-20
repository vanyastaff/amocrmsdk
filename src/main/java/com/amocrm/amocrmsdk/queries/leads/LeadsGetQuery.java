package com.amocrm.amocrmsdk.queries.leads;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.LeadsCollection;
import com.amocrm.amocrmsdk.filters.LeadsFilter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class LeadsGetQuery extends AbstractQueryBuilder<LeadsGetQuery, LeadsCollection> {
    /**
     * Create a AbstractQueryBuilder instance that can be used to build api request for get lead by identifier with various parameters
     * @param client Amo API client
     * @param leadId identifier of lead
     */
    public LeadsGetQuery(AmoApiClient client, Integer leadId) {
        super(client, "api/v4/leads/"+ leadId, LeadsCollection.class);
        setAuth(client.getAuth());
    }

    /**
     * Create a AbstractQueryBuilder instance that can be used to build api request with various parameters
     * @param client Amo API client
     */
    public LeadsGetQuery(AmoApiClient client) {
        super(client, "api/v4/leads", LeadsCollection.class);
        setAuth(client.getAuth());
    }

    /**
     * Set query "with" parameter
     * @param value possible values "catalog_elements,is_price_modified_by_robot,loss_reason,contacts,only_deleted,source_id"
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery with(String value) {
        return unsafeParam("with", value);
    }

    /**
     * Set query "page" parameter
     * @param value number of page
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery page(Integer value) {
        return unsafeParam("page", value);
    }

    /**
     * Set query "page" parameter
     * @param value number of items default is 50, max is 250
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery limit(Integer value) {
        if(value > 250) throw new IllegalArgumentException("Limit value can't be greater that 250");
        return unsafeParam("limit", value);
    }

    /**
     * Set query "query" parameter
     * @param value use for search entities by query in attributes or custom fields values of entity
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery query(String value) {
        return unsafeParam("query", value);
    }

    /**
     * Set query "query" parameter
     * @param value use for search entities by query in attributes or custom fields values of entity
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery query(Integer value) {
        return unsafeParam("query", value);
    }

    /**
     * Set query "filter" parameter
     * @param value a reference to this {@code LeadsFilter} object
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery filter(LeadsFilter value) {
        HashMap<String, Object> filterQuery = value.buildQueryMap();
        if(filterQuery.size() > 0) return unsafeParam("filter", filterQuery);
        return this;
    }

    /**
     * Set query "filter" parameter
     * @param value array data of filter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery filter(HashMap value) {
        return unsafeParam("filter", getGson().fromJson(getGson().toJson(value), LeadsFilter.class).buildQueryMap());
    }

    /**
     * Set query "order" parameter
     * @param attr sort attribute, possible only "created_at" or "updated_at" or "id"
     * @param sort sort direction
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetQuery order(String attr, String sort) {
        if(!Arrays.asList(new String[]{"created_at", "updated_at", "id"}).contains(attr))
            throw new IllegalArgumentException("Invalid order attribute parameter");
        if(!Arrays.asList(new String[]{"asc", "desc"}).contains(sort))
            throw new IllegalArgumentException("Invalid order sort parameter");

        return unsafeParam("order", new HashMap<String, String>().put(attr, sort));
    }

    @Override
    protected LeadsGetQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList();
    }
}
