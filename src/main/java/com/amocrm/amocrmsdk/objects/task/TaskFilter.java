package com.amocrm.amocrmsdk.objects.task;

import com.amocrm.amocrmsdk.constants.Entity;
import com.amocrm.amocrmsdk.objects.Filter;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.EnumSet;

@Data
@Accessors
public class TaskFilter extends Filter {

    @SerializedName("id")
    protected ArrayList<Integer> id;

    @SerializedName("responsible_user_id")
    protected int responsibleUserId;

    @SerializedName("is_completed")
    protected  boolean isCompleted;

    @SerializedName("task_type")
    protected ArrayList<Integer> taskType;

    @SerializedName("entity_type")
    protected EnumSet<Entity> entityType;

    @SerializedName("entity_id")
    protected ArrayList<Integer> entityId;

    @SerializedName("updated_at")
    protected int updatedAt;
}
