package com.amocrm.amocrmsdk.objects.unsorted.entities;

import com.amocrm.amocrmsdk.objects.unsorted.UnsortedMetadata;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.experimental.Accessors;
import lombok.Data;

import java.net.URL;
import java.util.Objects;

@Data
@Accessors(chain = true, fluent = true)
public class SipMetadata extends UnsortedMetadata {

    @SerializedName("from")
    private String from;

    @SerializedName("phone")
    private String phone;

    @SerializedName("called_at")
    private Integer calledAt;

    @SerializedName("duration")
    private Integer duration;

    @SerializedName("link")
    private URL link;

    @SerializedName("service_code")
    private String serviceCode;

    @SerializedName("is_call_event_needed")
    private Boolean isCallEventNeeded;

    @Override
    public String getType() { return "sip";}

    @Override
    public int hashCode() {
        return Objects.hash(from, phone, calledAt, duration, link, serviceCode);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SipMetadata other = (SipMetadata) o;
        return Objects.equals(from, other.from) &&
                Objects.equals(phone, other.phone) &&
                Objects.equals(calledAt, other.calledAt) &&
                Objects.equals(duration, other.duration) &&
                Objects.equals(link, other.link) &&
                Objects.equals(serviceCode, other.serviceCode);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SipMetadata{");
        sb.append("from=").append(from);
        sb.append(", phone=").append(phone);
        sb.append(", calledAt=").append(calledAt);
        sb.append(", duration=").append(duration);
        sb.append(", link=").append(link);
        sb.append(", serviceCode=").append(serviceCode);
        sb.append('}');
        return sb.toString();
    }
}
