package com.amocrm.amocrmsdk.objects.lead.response;


import com.amocrm.amocrmsdk.objects.base.Links;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true, fluent = true)
public class LeadCreateResponse {
    @SerializedName("id")
    private Integer id;

    @SerializedName("request_id")
    private Integer requestId;

    @SerializedName("_links")
    private Links links;
}
