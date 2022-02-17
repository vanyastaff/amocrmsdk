package com.amocrm.amocrmsdk.objects.tag;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class Tag {

    @SerializedName("id")
    protected int id;

    @SerializedName("name")
    protected String name;
}
