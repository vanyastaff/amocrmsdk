package com.amocrm.amocrmsdk.queries.account;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.objects.account.Account;
import com.amocrm.amocrmsdk.queries.leads.LeadsGetQuery;

import java.lang.reflect.Type;
import java.util.Collection;

public class AccountGetQuery extends AbstractQueryBuilder<AccountGetQuery, Account> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     */
    public AccountGetQuery(AmoApiClient client) {
        super(client, "api/v4/account/", Account.class);
        with("amojo_id,amojo_rights,users_groups,task_types,version,datetime_settings");
        setAuth(client.getAuth());
    }

    /**
     * Set query "with" parameter
     * @param value possible values "amojo_id,amojo_rights,users_groups,task_types,version,datetime_settings"
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetQuery with(String value) {
        return unsafeParam("with", value);
    }

    @Override
    protected AccountGetQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
