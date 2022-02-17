package com.amocrm.amocrmsdk.objects.base;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class Links {
    @Getter
    @SerializedName("self")
    private SelfLink self;
}
