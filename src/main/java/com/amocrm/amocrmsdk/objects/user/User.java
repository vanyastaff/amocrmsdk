package com.amocrm.amocrmsdk.objects.user;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {

    @Getter
    @SerializedName("id")
    public int id;

    @Getter
    @Setter
    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    public String lang;

    @SerializedName("rights")
    public Rights rights;
}
