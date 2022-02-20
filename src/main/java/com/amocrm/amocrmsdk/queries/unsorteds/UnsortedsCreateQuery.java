package com.amocrm.amocrmsdk.queries.unsorteds;

import com.amocrm.amocrmsdk.client.AbstractQueryBuilder;
import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.UnsortedCollection;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UnsortedsCreateQuery extends AbstractQueryBuilder<UnsortedsCreateQuery, UnsortedCollection> {

    private static final Logger LOG = LoggerFactory.getLogger(UnsortedsCreateQuery.class);

    private String unsortedType;

    private String body;

    public UnsortedsCreateQuery(AmoApiClient client, Unsorted unsorted, String type) {
        super(client, "api/v4/leads/unsorted/" + type, UnsortedCollection.class);
        setAuth(client.getAuth());
        setBody(unsorted);
        unsortedType = type;
    }

    public UnsortedsCreateQuery(AmoApiClient client, UnsortedCollection unsorteds, String type) {
        super(client, "api/v4/leads/unsorted/" + type, UnsortedCollection.class);
        setAuth(client.getAuth());
        setBody(unsorteds, type);
        unsortedType = type;
    }

    /**
     * Create json object from data to pass post data
     * @param object data
     */
    protected void setBody(Unsorted object) {
        object.requestId(object.hashCode());
        body = getGson().toJson(Arrays.asList(object));
    }

    protected void setBody(Collection<Unsorted> object, String type) {
        body = getGson().toJson(object.stream()
                .filter(unsorted -> unsorted.metadata().getType() == type)
                .map(unsorted -> unsorted.requestId(unsorted.hashCode())).collect(Collectors.toList()));
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
        if(StringUtils.isEmpty(unsortedType) || !unsortedType.matches("^.*?(sip|forms).*$"))  {
            throw new IllegalArgumentException("Unsorted api create possible only sip or forms unsorted");
        }
        try {
            if(StringUtils.isNoneEmpty(body)) {
                return getTransportClient().post(getUrl(), mapToGetString(build()) ,body).getContent();
            }
            return getTransportClient().post(getUrl(), mapToGetString(build()), null).getContent();
        } catch (IOException e ) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new ClientException("I/O exception");
        }
    }

    /**
     * Get reference to this object
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Override
    protected UnsortedsCreateQuery getThis() {
        return this;
    }

    /**
     * Get list of required parameter names
     *
     * @return list of names
     */
    @Override
    protected Collection<String> essentialKeys() {
        return null;
    }
}
