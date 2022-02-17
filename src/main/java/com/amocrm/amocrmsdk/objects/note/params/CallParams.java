package com.amocrm.amocrmsdk.objects.note.params;

import com.amocrm.amocrmsdk.objects.note.NoteParams;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class CallParams extends NoteParams {
    @SerializedName("uniq")
    protected String uniq;

    @SerializedName("duration")
    protected int duration;

    @SerializedName("source")
    protected String source;

    @SerializedName("link")
    protected  String link;

    @SerializedName("phone")
    protected String phone;
}
