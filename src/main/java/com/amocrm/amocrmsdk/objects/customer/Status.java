package com.amocrm.amocrmsdk.objects.customer;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(fluent = true, chain = true)
public class Status {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("sort")
    private Integer sort;

    @SerializedName("is_default")
    private Boolean isDefault;

    @SerializedName("conditions")
    private List<Condition> conditions;

    @SerializedName("color")
    private String color;

    @SerializedName("type")
    private Integer type;

    @SerializedName("account_id")
    private Integer accountId;
}
