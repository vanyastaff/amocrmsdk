package com.amocrm.amocrmsdk.auth;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.Auth;
import com.amocrm.amocrmsdk.objects.auth.AccessToken;

public class OAuth extends Auth {

    private String client_id;

    private String client_secret;

    private String redirect_uri;

    protected String domain;

    protected String domainZone;

    private AccessToken accessToken;

    @Override
    public void build(AbstractQueryBuilder builder) {

    }

    private Boolean existToken() {
        return false;
    }

    @Override
    public String getDomainUrl() {
        return this.domain + ".amocrm."+ this.domainZone;
    }
}
