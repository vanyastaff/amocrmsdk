package com.amocrm.amocrmsdk.objects.unsorted.entities;

import com.amocrm.amocrmsdk.objects.unsorted.UnsortedMetadata;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class ChatMetadata extends UnsortedMetadata {
    @SerializedName("from")
    private String from;

    @SerializedName("to")
    private String to;

    @SerializedName("received_at")
    private Integer receivedAt;

    @SerializedName("service")
    private String service;

    @SerializedName("client")
    private Map<String, String> client;

    @SerializedName("origin")
    private Map<String, String> origin;

    @SerializedName("last_message_text")
    private String lastMessageText;

    @SerializedName("source_name")
    private String sourceName;

    @Override
    public String getType() { return "chat";}

    @Override
    public int hashCode() {
        return Objects.hash(from, to, receivedAt, client, origin, lastMessageText, service, sourceName);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMetadata other = (ChatMetadata) o;
        return Objects.equals(from, other.from) &&
                Objects.equals(to, other.to) &&
                Objects.equals(receivedAt, other.receivedAt) &&
                Objects.equals(client, other.client) &&
                Objects.equals(origin, other.origin) &&
                Objects.equals(lastMessageText, other.lastMessageText) &&
                Objects.equals(service, other.service) &&
                Objects.equals(sourceName, other.sourceName);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatMetadata{");
        sb.append("from=").append(from);
        sb.append(", to=").append(to);
        sb.append(", receivedAt=").append(receivedAt);
        sb.append(", client=").append(client);
        sb.append(", origin=").append(origin);
        sb.append(", lastMessageText=").append(lastMessageText);
        sb.append(", service=").append(service);
        sb.append(", sourceName=").append(sourceName);
        sb.append('}');
        return sb.toString();
    }

}
