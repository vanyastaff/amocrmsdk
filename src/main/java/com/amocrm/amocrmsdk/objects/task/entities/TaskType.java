package com.amocrm.amocrmsdk.objects.task.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;

@Getter
@Accessors(fluent = true)
public class TaskType {
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("color")
    private String color;

    @SerializedName("icon_id")
    private Integer iconId;

    @SerializedName("code")
    private String code;

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskType other = (TaskType) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(color, other.color) &&
                Objects.equals(iconId, other.iconId) &&
                Objects.equals(code, other.code);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TaskType{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", iconId=").append(iconId);
        sb.append(", code=").append(code);
        sb.append('}');
        return sb.toString();
    }
}
