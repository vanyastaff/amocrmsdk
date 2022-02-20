package com.amocrm.amocrmsdk;

import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.UnsortedCollection;
import com.amocrm.amocrmsdk.objects.unsorted.Unsorted;
import com.amocrm.amocrmsdk.objects.unsorted.responses.UnsortedSummary;
import com.amocrm.amocrmsdk.services.UnsortedService;
import org.junit.Assert;
import org.junit.Test;

public class UnsortedTest extends AmoCrmClientTest {

    private UnsortedService getService() {
        AmoApiClient amo = new AmoApiClient(getAuth());
        return amo.unsorteds();
    }

    @Test
    public void testCreateUnsortedSip() {
        UnsortedCollection result = null;
        Unsorted unsorted = new Unsorted().sourceId("test").sourceName("hello").pipelineId(247438);
        try {
            result = getService().create(unsorted, "forms").execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUnsorted() {
        UnsortedCollection result = null;
        try {
            result = getService().get().execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(result.getClass(), UnsortedCollection.class);
    }

    @Test
    public void testGetUnsortedSummary() {
        UnsortedSummary result = null;

        try {
            result = getService().summary().execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(result.getClass(), UnsortedSummary.class);
    }

}
