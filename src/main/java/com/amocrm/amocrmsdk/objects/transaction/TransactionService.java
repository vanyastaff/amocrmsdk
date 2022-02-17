package com.amocrm.amocrmsdk.objects.transaction;

import com.amocrm.amocrmsdk.QueryBuilder;
import com.amocrm.amocrmsdk.Service;

public class TransactionService extends Service {

    private String url = "/api/v4/leads";

    private Class<Transaction> model() {
        return Transaction.class;
    }

//    public Class<TransactionCollection> collection() {
//        return TransactionCollection.class;
//    }

    public TransactionService byId(int id) {
         this.queryBuilder =  new QueryBuilder().setUrl(this.url)
                 .setFilter(new TransactionFilter().id(id).buildQuery());
         return this;
    }

    public  void byQuery(QueryBuilder query) {
        this.queryBuilder = query;
    }

    public  void byFilter(TransactionFilter filter) {
        this.queryBuilder =  new QueryBuilder().setFilter(filter.buildQuery());
    }
}
