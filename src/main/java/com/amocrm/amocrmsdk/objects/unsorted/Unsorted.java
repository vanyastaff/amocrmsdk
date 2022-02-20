package com.amocrm.amocrmsdk.objects.unsorted;

import com.amocrm.amocrmsdk.utils.annotations.Required;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(fluent = true, chain = true)
public class Unsorted {

    @SerializedName("uid")
    private UUID uid;

    @Required
    @SerializedName("source_uid")
    private String sourceId;

    @Required
    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("category")
    private String category;

    @Required
    @SerializedName("pipeline_id")
    private Integer pipelineId;

    @Required
    @SerializedName("created_at")
    private Integer createdAt;

    @Required
    @SerializedName("metadata")
    private UnsortedMetadata metadata;

    @Required
    @SerializedName("_embedded")
    private UnsortedEmbedded embedded;

    @SerializedName("account_id")
    private Integer accountId;

    @Required
    @SerializedName("request_id")
    private Integer requestId;
}
