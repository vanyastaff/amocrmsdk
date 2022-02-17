package com.amocrm.amocrmsdk.objects.note;

import com.amocrm.amocrmsdk.constants.Entity;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class NoteLinked {
    @SerializedName("id")
    protected int id;

    @SerializedName("entity_id")
    protected int entityId;

    @SerializedName("entity_type")
    protected Entity entityType;

    @SerializedName("text")
    protected String text;
}
