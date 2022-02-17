package com.amocrm.amocrmsdk.objects.user;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class UserGroupLinked {
    @SerializedName("id")
    protected int id;

    @SerializedName("name")
    protected String name;

    UserGroupLinked(int groupId) {
        this.id = groupId;
    }
}
