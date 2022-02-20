package com.amocrm.amocrmsdk.filters;

import com.amocrm.amocrmsdk.client.AbstractFilter;
import com.amocrm.amocrmsdk.collections.UnsortedCollection;
import com.amocrm.amocrmsdk.objects.base.filter_values.IntegerArrayFilterValue;
import com.amocrm.amocrmsdk.objects.base.filter_values.StringArrayFilterValue;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class UnsortedFilter extends AbstractFilter<UnsortedFilter, UnsortedCollection> {

    @SerializedName("uid")
    private StringArrayFilterValue uid;

    @SerializedName("category")
    private StringArrayFilterValue category;

    @SerializedName("pipeline_id")
    private IntegerArrayFilterValue pipelineId;

    @Override
    public int hashCode() {
        return Objects.hash(uid, category, pipelineId);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnsortedFilter other = (UnsortedFilter) o;
        return Objects.equals(uid, other.uid) &&
                Objects.equals(category, other.category) &&
                Objects.equals(pipelineId, other.pipelineId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnsortedFilter{");
        sb.append("uid=").append(uid);
        sb.append(", category=").append(category);
        sb.append(", pipelineId=").append(pipelineId);
        sb.append('}');
        return sb.toString();
    }
}
