package com.amocrm.amocrmsdk.services;

import com.amocrm.amocrmsdk.client.AbstractService;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.queries.account.AccountGetQuery;

public class AccountService extends AbstractService {

    public AccountService(AmoApiClient amoApiClient) { super(amoApiClient);}

    /**
     * Get current account
     *
     * @return AbstractQueryBuilder
     */
    public AccountGetQuery get() {
        return new AccountGetQuery(getClient());
    }
}
