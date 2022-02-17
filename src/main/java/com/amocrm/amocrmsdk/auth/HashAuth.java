package com.amocrm.amocrmsdk.auth;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.Auth;

import java.util.HashMap;

public class HashAuth extends Auth {

    protected String login;

    protected String hash;

    protected String domain;

    protected String domainZone;

    public HashAuth(String login, String hash, String domain) {
        this(login, hash, domain, "ru");
    }

    public HashAuth(String login, String hash, String domain, String domainZone) {
        this.login = login;
        this.hash = hash;
        this.domain = domain;
        this.domainZone = domainZone;
    }

    @Override
    public void build(AbstractQueryBuilder builder) {
        builder.unsafeParam("USER_LOGIN", login);
        builder.unsafeParam("USER_HASH", hash);
    }

    @Override
    public String getDomainUrl() {
        return this.domain + ".amocrm."+ this.domainZone;
    }
}
