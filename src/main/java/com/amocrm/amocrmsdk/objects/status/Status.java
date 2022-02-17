package com.amocrm.amocrmsdk.objects.status;

import lombok.Data;
import lombok.experimental.Accessors;
import com.google.gson.annotations.SerializedName;

@Data
@Accessors(fluent = true, chain = true)
public class Status {

    @SerializedName("id")
    protected int id;

    @SerializedName("name")
    protected String name;

    @SerializedName("sort")
    protected int sort;

    @SerializedName("is_editable")
    protected boolean isEditable;

    @SerializedName("pipeline_id")
    protected int pipelineId;

    @SerializedName("color")
    protected String color;

    @SerializedName("type")
    protected short type;
}
