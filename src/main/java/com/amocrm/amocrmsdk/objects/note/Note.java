package com.amocrm.amocrmsdk.objects.note;

import com.amocrm.amocrmsdk.constants.Entity;
import com.amocrm.amocrmsdk.constants.NoteType;
import com.amocrm.amocrmsdk.objects.user.UserGroupLinked;
import com.amocrm.amocrmsdk.objects.user.UserLinked;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class Note {
    @SerializedName("id")
    protected int id;

    @SerializedName("entity_id")
    protected int entityId;

    @SerializedName("entity_type")
    protected Entity entityType;

    @SerializedName("note_type")
    protected NoteType noteType;

    @SerializedName("params")
    protected NoteParams params;

    @SerializedName("responsible_user_id")
    protected UserLinked responsibleUserId;

    @SerializedName("group_id")
    protected UserGroupLinked groupId;

    @SerializedName("created_by")
    protected UserLinked createdBy;

    @SerializedName("updated_by")
    protected UserLinked updatedBy;

    @SerializedName("created_at")
    protected int createdAt;

    @SerializedName("updated_at")
    protected int updatedAt;
}
