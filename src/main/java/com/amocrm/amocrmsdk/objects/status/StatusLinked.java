package com.amocrm.amocrmsdk.objects.status;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class StatusLinked {

    @SerializedName("id")
    protected int id;

    @SerializedName("name")
    protected String name;
}
