package com.amocrm.amocrmsdk.objects.unsorted.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class UnsortedSummary {
    @SerializedName("total")
    private Integer total;

    @SerializedName("accepted")
    private Integer accepted;

    @SerializedName("declined")
    private Integer declined;

    @SerializedName("average_sort_time")
    private Integer averageSortTime;

    @SerializedName("categories")
    private Map<String, Map<String, Integer>> categories;
}
