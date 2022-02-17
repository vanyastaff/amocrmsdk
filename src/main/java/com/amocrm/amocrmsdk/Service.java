package com.amocrm.amocrmsdk;

import com.amocrm.amocrmsdk.objects.BaseCollection;

public abstract class Service {

    protected  QueryBuilder queryBuilder;

    protected BaseCollection get() throws InstantiationException, IllegalAccessException {
        return new BaseCollection();
    }

//    public abstract Class<BaseCollection> collection();

    public QueryBuilder getBuilder() {
        return queryBuilder;
    }

}
