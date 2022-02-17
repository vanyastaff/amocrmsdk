package com.amocrm.amocrmsdk.objects.pipeline;

import com.amocrm.amocrmsdk.objects.status.Status;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;

@Data
@Accessors(fluent = true, chain = true)
public class Pipeline {

    @SerializedName("id")
    protected int id;

    @SerializedName("name")
    protected String name;

    @SerializedName("sort")
    protected int sort;

    @SerializedName("is_main")
    protected boolean isMain;

    @SerializedName("is_unsorted_on")
    protected boolean isUnsortedOn;

    @SerializedName("_embedded")
    protected ArrayList<Status> statuses;

}
