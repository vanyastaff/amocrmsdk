package com.amocrm.amocrmsdk.objects.transaction;

import com.amocrm.amocrmsdk.objects.Filter;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Accessors(fluent = true, chain = true)
public class TransactionFilter extends Filter {

    @Getter
    @SerializedName("id")
    protected ArrayList<Integer> id;

    public TransactionFilter id(ArrayList<Integer> id) throws IllegalArgumentException {
        if(id.size() > 500) throw new IllegalArgumentException("Too many element passed");
        this.id = id;
        return this;
    }

    public TransactionFilter id(Integer id) {
        this.id = new ArrayList<Integer>();
        this.id.add(id);
        return this;
    }

    public Map<String, Object> buildQuery() {
        Map<String, Object> filter = new HashMap<String, Object>();
        filter.put("id", this.id());
        filter.putAll(super.buildQuery());
        return filter;
    }
}
