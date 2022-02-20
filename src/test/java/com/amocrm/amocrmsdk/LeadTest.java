package com.amocrm.amocrmsdk;

import com.amocrm.amocrmsdk.client.AmoApiClient;
import com.amocrm.amocrmsdk.collections.LeadsCollection;
import com.amocrm.amocrmsdk.exceptions.ApiException;
import com.amocrm.amocrmsdk.exceptions.ClientException;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.amocrm.amocrmsdk.queries.leads.LeadsCreateQuery;
import com.amocrm.amocrmsdk.services.LeadService;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class LeadTest extends AmoCrmClientTest {

    @Test
    public void testGetLeadService() {
        AmoApiClient amo = new AmoApiClient();
        LeadService service = amo.leads();

        Assert.assertTrue(service instanceof LeadService);
    }

    @Test
    public void testGetLeadsByFilter() {
        HashMap<String, Object> filterObj = new HashMap<String, Object>();
        Integer ids[] = new Integer[] {28091207};
        filterObj.put("id", Arrays.asList(ids));

        AmoApiClient amo = new AmoApiClient(this.getAuth());
        LeadService service = amo.leads();
        LeadsCollection data = null;
        try {
            data = service.filter(filterObj).limit(1).execute();
        } catch (ClientException e) {

        } catch (ApiException e) {
        }

        Assert.assertEquals(data.size(), 1);
        Assert.assertEquals(Optional.ofNullable(data.get(0).id()), Optional.of(28091207));
    }

    @Test
    public void testGetLeads() {
        AmoApiClient amo = new AmoApiClient(this.getAuth());
        LeadService service = amo.leads();
        Object data = null;
        try {
            data = service.get().limit(1).execute();
        } catch (ClientException e) {

        } catch (ApiException e) {
        }

        Assert.assertTrue(data instanceof LeadsCollection);
        Assert.assertEquals(((LeadsCollection) data).size(), 1);
    }

    @Test
    public void testCreateLead() {
        AmoApiClient amo = new AmoApiClient(this.getAuth());
        LeadService leadService = amo.leads();

        Lead lead = new Lead().name("New Lead " + new Random().nextInt());
        try {
            LeadsCollection result = leadService.create(lead).execute();
            Assert.assertEquals(result.size(), 1);
            Assert.assertEquals(result.get(0).name(), lead.name());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
