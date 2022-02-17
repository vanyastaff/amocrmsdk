package com.amocrm.amocrmsdk.objects.transaction;

import com.amocrm.amocrmsdk.QueryBuilder;
import com.google.gson.Gson;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TransactionTest {


    @Test
    @Ignore
    public void testCreateTransactionObject() {
        Transaction transaction = new Transaction().comment("Pay accepted").price(1000);

        assertEquals(transaction.getClass(), Transaction.class);
        assertEquals(transaction.price, 1000);
        assertEquals(transaction.comment(), "Pay accepted");
    }

    @Test
    public void testCreateTransactionFromJSON() {
        String json = "{\"id\":3234324322,\"price\":3232, \"comment\": \"Hello\"}";
        Transaction transaction = new Gson().fromJson(json, Transaction.class);

        assertEquals(transaction.id, 3234324322L);
        assertEquals(transaction.price, 3232);
        assertEquals(transaction.comment(), "Hello");
        assertEquals(transaction.createdBy, 0);

        transaction.price(1000);

        assertEquals(transaction.price, 1000);
    }

    @Test
    public void testCreateTransactionFilter() {
        TransactionFilter filter = new TransactionFilter().id(13232);

        assertEquals(filter.id().getClass(), ArrayList.class);
        assertEquals(filter.id().size(), 1);

        ArrayList<Integer> transactionIds = new ArrayList<>(Arrays.asList(13232, 13233, 13232));
        filter.id(transactionIds);

        assertEquals(filter.id().size(), 3);

        Map<String, Object> query =  filter.buildQuery();
        assertEquals(query.get("id").getClass(), ArrayList.class);
        assertEquals(((ArrayList<Integer>) query.get("id")).size(), 3);

        ArrayList array = new ArrayList<Integer>();
        for (int a = 0; a < 503; a++) { array.add(a); }

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> filter.id(array));
        assertEquals("Too many element passed", exception.getMessage());
    }

    @Test
    public void testGetTransactionById() {
        TransactionService service = new TransactionService().byId(121);

        assertEquals(service.getBuilder().getClass(), QueryBuilder.class);
        assertEquals(Optional.ofNullable(((ArrayList<Integer>) service.getBuilder().getFilter().get("id")).get(0)), Optional.of(121));
    }
}
