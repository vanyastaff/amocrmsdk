package com.amocrm.amocrmsdk.objects.base;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class Error {

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private String type;

    @SerializedName("status")
    private Integer status;

    @SerializedName("detail")
    private String detail;
}
