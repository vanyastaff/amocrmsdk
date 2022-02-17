package com.amocrm.amocrmsdk.objects.base;

import lombok.Data;
import lombok.experimental.Accessors;
import com.google.gson.annotations.SerializedName;

@Data
@Accessors(fluent = true, chain = true)
public class CustomFieldValueDTO {

    @SerializedName("value")
    public String value;

    @SerializedName("enum_id")
    public Integer enumId;

    @SerializedName("enum_code")
    public String enumCode;
}
