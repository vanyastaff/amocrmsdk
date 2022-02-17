package com.amocrm.amocrmsdk.objects.user.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;

@Getter
@Accessors(fluent = true)
public class UserGroup {
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserGroup other = (UserGroup) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserGroup{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
