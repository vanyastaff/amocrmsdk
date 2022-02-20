package com.amocrm.amocrmsdk.objects.unsorted.entities;

import com.amocrm.amocrmsdk.objects.unsorted.UnsortedMetadata;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class MailMetadata extends UnsortedMetadata {

    @SerializedName("from")
    private Map<String, String> from;

    @SerializedName("received_at")
    private Integer receivedAt;

    @SerializedName("subject")
    private String subject;

    @SerializedName("thread_id")
    private Integer threadId;

    @SerializedName("message_id")
    private Integer messageId;

    @SerializedName("content_summary")
    private String contentSummary;

    @Override
    public String getType() { return "mail";}

    @Override
    public int hashCode() {
        return Objects.hash(from, receivedAt, subject, threadId, messageId, contentSummary);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailMetadata other = (MailMetadata) o;
        return Objects.equals(from, other.from) &&
                Objects.equals(receivedAt, other.receivedAt) &&
                Objects.equals(subject, other.subject) &&
                Objects.equals(threadId, other.threadId) &&
                Objects.equals(messageId, other.messageId) &&
                Objects.equals(contentSummary, other.contentSummary);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MailMetadata{");
        sb.append("from=").append(from);
        sb.append(", receivedAt=").append(receivedAt);
        sb.append(", subject=").append(subject);
        sb.append(", threadId=").append(threadId);
        sb.append(", messageId=").append(messageId);
        sb.append(", contentSummary=").append(contentSummary);
        sb.append('}');
        return sb.toString();
    }
}
