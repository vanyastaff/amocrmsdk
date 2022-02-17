package com.amocrm.amocrmsdk.objects.base;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;

@Data
@Accessors(fluent = true, chain = true)
public class CustomField {

    @SerializedName("field_id")
    public int fieldId;

    @SerializedName("field_name")
    public String fieldName;

    @SerializedName("field_code")
    public String fieldCode;

    @SerializedName("field_type")
    public String fieldType;

    @SerializedName("values")
    public ArrayList<Object> values;
}
