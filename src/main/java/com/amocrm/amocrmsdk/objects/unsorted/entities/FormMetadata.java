package com.amocrm.amocrmsdk.objects.unsorted.entities;

import com.amocrm.amocrmsdk.objects.unsorted.UnsortedMetadata;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class FormMetadata extends UnsortedMetadata {

    @SerializedName("form_id")
    private String formId;

    @SerializedName("form_name")
    private String formName;

    @SerializedName("form_page")
    private String formPage;

    @SerializedName("ip")
    private String ip;

    @SerializedName("form_sent_at")
    private Integer formSentAt;

    @SerializedName("referer")
    private String referer;

    @Override
    public String getType() { return "forms";}

    @Override
    public int hashCode() {
        return Objects.hash(formId, formName, formPage, formSentAt, ip, referer);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormMetadata other = (FormMetadata) o;
        return Objects.equals(formId, other.formId) &&
                Objects.equals(formName, other.formName) &&
                Objects.equals(formPage, other.formPage) &&
                Objects.equals(formSentAt, other.formSentAt) &&
                Objects.equals(ip, other.ip) &&
                Objects.equals(referer, other.referer);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FormMetadata{");
        sb.append("formId=").append(formId);
        sb.append(", formName=").append(formName);
        sb.append(", formPage=").append(formPage);
        sb.append(", formSentAt=").append(formSentAt);
        sb.append(", ip=").append(ip);
        sb.append(", referer=").append(referer);
        sb.append('}');
        return sb.toString();
    }
}
