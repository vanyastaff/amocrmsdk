package com.amocrm.amocrmsdk.objects.note.params;

import com.amocrm.amocrmsdk.objects.note.NoteParams;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class CommonParams extends NoteParams {
    @SerializedName("text")
    protected String text;
}
