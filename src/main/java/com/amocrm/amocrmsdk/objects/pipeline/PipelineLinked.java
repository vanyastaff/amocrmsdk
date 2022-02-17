package com.amocrm.amocrmsdk.objects.pipeline;

import lombok.Data;
import lombok.experimental.Accessors;
import com.google.gson.annotations.SerializedName;

@Data
@Accessors(fluent = true, chain = true)
public class PipelineLinked {

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;

    public PipelineLinked(int pipelineId) {
        this.id = pipelineId;
    }
}
