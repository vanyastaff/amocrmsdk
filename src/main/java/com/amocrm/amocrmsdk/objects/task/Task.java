package com.amocrm.amocrmsdk.objects.task;

import lombok.Data;
import lombok.experimental.Accessors;
import com.amocrm.amocrmsdk.constants.Entity;
import com.amocrm.amocrmsdk.objects.note.NoteLinked;
import com.google.gson.annotations.SerializedName;

@Data
@Accessors(fluent = true, chain = true)
public class Task {

    @SerializedName("id")
    protected int id;

    @SerializedName("entity_id")
    protected  int entityId;

    @SerializedName("entity_type")
    protected Entity entityType;

    @SerializedName("text")
    protected String text;

    @SerializedName("duration")
    protected int duration;

    @SerializedName("task_type_id")
    protected int taskTypeId;

    @SerializedName("is_completed")
    protected boolean isCompleted;

    @SerializedName("complete_till")
    protected int completeTill;

    @SerializedName("responsible_user_id")
    protected int responsibleUserId;

    @SerializedName("group_id")
    protected  int groupId;

    @SerializedName("created_by")
    protected  int createdBy;

    @SerializedName("updated_by")
    protected  int updatedBy;

    @SerializedName("created_at")
    protected  int createdAt;

    @SerializedName("updated_at")
    protected int updatedAt;

    @SerializedName("result")
    protected NoteLinked result;

    public Task noteLinked(int noteId) {
        this.result = new NoteLinked().id(noteId).entityId(this.entityId).entityType(Entity.TASK);
        return this;
    }

    public Task noteLinked(String text) {
        this.result = new NoteLinked().entityId(this.entityId).entityType(Entity.TASK).text(text);
        return this;
    }

    public Task noteLinked(int entityId, String entityType) {
        this.result = new NoteLinked().entityId(this.entityId).entityType(Entity.valueOf(entityType));
        return this;
    }

}
