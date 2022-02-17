package com.amocrm.amocrmsdk.objects.account.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;

@Getter
@Accessors(fluent = true)
public class AmojoRight {
    @SerializedName("can_direct")
    private Boolean canDirect;

    @SerializedName("can_create_groups")
    private  Boolean canCreateGroups;

    @Override
    public int hashCode() {
        return Objects.hash(canDirect, canCreateGroups);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmojoRight other = (AmojoRight) o;
        return Objects.equals(canDirect, other.canDirect) &&
                Objects.equals(canCreateGroups, other.canCreateGroups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AmojoRight{");
        sb.append("canDirect=").append(canDirect);
        sb.append(", canCreateGroups=").append(canCreateGroups);
        sb.append('}');
        return sb.toString();
    }
}
