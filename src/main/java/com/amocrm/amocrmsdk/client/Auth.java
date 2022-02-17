package com.amocrm.amocrmsdk.client;

public abstract class Auth {

    public abstract void build(AbstractQueryBuilder builder);

    public abstract String getDomainUrl();
}
