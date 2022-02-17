package com.amocrm.amocrmsdk.objects.tag;

import com.amocrm.amocrmsdk.objects.Filter;
import lombok.Data;
import lombok.experimental.Accessors;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Data
@Accessors(fluent = true, chain = true)
public class TagFilter extends Filter {

    @SerializedName("name")
    protected String name;

    @SerializedName("id")
    protected ArrayList<Integer> id;
}
