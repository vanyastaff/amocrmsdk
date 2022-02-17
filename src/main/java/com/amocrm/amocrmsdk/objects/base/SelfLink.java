package com.amocrm.amocrmsdk.objects.base;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class SelfLink {

    @Getter
    @SerializedName("href")
    private String link;
}
