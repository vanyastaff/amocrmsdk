package com.amocrm.amocrmsdk.objects.customer;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Condition {

    @SerializedName("type")
    private String type;

    @SerializedName("match")
    private ConditionMatch match;

    @SerializedName("conditions")
    private List<ConditionMatch> conditions;

    @SerializedName("tmpl")
    private String tmpl;
}
