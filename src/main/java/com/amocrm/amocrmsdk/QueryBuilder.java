package com.amocrm.amocrmsdk;

import java.util.Map;

public class QueryBuilder {

    protected String url;

    protected Map<String, Object> filter;

    protected int limit;

    protected int page;

    protected String with;

    public Map<String, Object> getFilter() {
        return filter;
    }

    public QueryBuilder setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getWith() {
        return with;
    }

    public void setWith(String with) {
        this.with = with;
    }

    public String getUrl() {
        return url;
    }

    public QueryBuilder setUrl(String url) {
        this.url = url;
        return this;
    }
}
