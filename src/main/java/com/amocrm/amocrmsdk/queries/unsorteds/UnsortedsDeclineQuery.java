package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class UnsortedsDeclineQuery extends AbstractQueryBuilder<UnsortedsDeclineQuery, Unsorted> {

    private static final Logger LOG = LoggerFactory.getLogger(UnsortedsDeclineQuery.class);

    private String body;

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     * @param uid UUID of unsorted
     */
    public UnsortedsDeclineQuery(AmoApiClient client, String uid) {
        super(client, "api/v4/leads/unsorted/"+uid+"/decline", Unsorted.class);
        setAuth(client.getAuth());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   AMO client
     * @param uid UUID of unsorted
     * @param body map with user_id optional
     */
    public UnsortedsDeclineQuery(AmoApiClient client, String uid, Map<String, Integer> body) {
        super(client, "api/v4/leads/unsorted/"+uid+"/decline", Unsorted.class);
        setAuth(client.getAuth());
        setBody(body);
    }

    /**
     * Create json object from data to pass post data
     * @param object map data with user_id
     */
    protected void setBody(Map<String, Integer> object) {
        body = getGson().toJson(object);
    }

    public String getBody() {
        return body;
    }

    /**
     * Override method to use post request
     * @return
     * @throws ClientException
     */
    @Override
    public String executeAsString() throws ClientException {
        try {
            if(StringUtils.isNoneEmpty(body)) {
                return getTransportClient().delete(getUrl(), null ,body).getContent();
            }
            return getTransportClient().delete(getUrl(),null, null).getContent();
        } catch (IOException e ) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new ClientException("I/O exception");
        }
    }

    @Override
    protected UnsortedsDeclineQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
