package com.amocrm.amocrmsdk.objects.account;

import com.amocrm.amocrmsdk.objects.account.entities.AmojoRight;
import com.amocrm.amocrmsdk.objects.account.entities.DateTimePatterns;
import com.amocrm.amocrmsdk.objects.user.entities.UserGroup;
import com.amocrm.amocrmsdk.objects.task.entities.TaskType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Objects;

public class AccountEmbedded {

    @SerializedName("amojo_rights")
    private AmojoRight amojoRights;

    @SerializedName("users_groups")
    private Collection<UserGroup> userGroups;

    @SerializedName("task_types")
    private Collection<TaskType> taskTypes;

    @SerializedName("datetime_settings")
    private DateTimePatterns dateTimePatterns;

    @Override
    public int hashCode() {
        return Objects.hash(amojoRights, userGroups, taskTypes, dateTimePatterns);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEmbedded other = (AccountEmbedded) o;
        return Objects.equals(amojoRights, other.amojoRights) &&
                Objects.equals(userGroups, other.userGroups) &&
                Objects.equals(taskTypes, other.taskTypes) &&
                Objects.equals(dateTimePatterns, other.dateTimePatterns);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AccountEmbedded{");
        sb.append("amojoRights=").append(amojoRights);
        sb.append(", userGroups=").append(userGroups);
        sb.append(", taskTypes=").append(taskTypes);
        sb.append(", dateTimePatterns=").append(dateTimePatterns);
        sb.append('}');
        return sb.toString();
    }
}
