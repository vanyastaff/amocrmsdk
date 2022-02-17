package com.amocrm.amocrmsdk.objects.lead;


import com.google.gson.Gson;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import com.google.gson.annotations.SerializedName;
import com.amocrm.amocrmsdk.objects.base.CustomField;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Data
@Accessors(fluent = true, chain = true)
public class Lead {

    @Setter(AccessLevel.PRIVATE)
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("price")
    private Integer price;

    @SerializedName("responsible_user_id")
    private Integer responsibleUserId;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("status_id")
    private Integer statusId;

    @SerializedName("pipeline_id")
    private Integer pipelineId;

    @SerializedName("loss_reason_id")
    private Integer lossReasonId;

    @SerializedName("created_by")
    private Integer createdBy;

    @SerializedName("updated_by")
    private Integer updatedBy;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("closed_at")
    private Integer closedAt;

    @SerializedName("closest_task_at")
    private Integer closestTaskAt;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    @SerializedName("custom_fields_values")
    private Collection<CustomField> customFields;

    @SerializedName("score")
    private Integer score;

    @SerializedName("source_id")
    private Integer sourceId;

    @SerializedName("is_price_modified_by_robot")
    private Boolean isPriceModifiedByRobot;

    @SerializedName("_embedded")
    private LeadEmbedded embedded;

    @SerializedName("account_id")
    private Integer accountId;

    @SerializedName("request_id")
    private Integer requestId;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, responsibleUserId, groupId, statusId, pipelineId, lossReasonId, createdBy, updatedBy, createdAt, updatedAt, closestTaskAt, isDeleted, customFields,score, sourceId, isPriceModifiedByRobot, embedded, accountId);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead other = (Lead) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(price, other.price) &&
                Objects.equals(responsibleUserId, other.responsibleUserId) &&
                Objects.equals(groupId, other.groupId) &&
                Objects.equals(statusId, other.statusId) &&
                Objects.equals(pipelineId, other.pipelineId) &&
                Objects.equals(lossReasonId, other.lossReasonId) &&
                Objects.equals(createdBy, other.createdBy) &&
                Objects.equals(updatedBy, other.updatedAt) &&
                Objects.equals(createdAt, other.createdAt) &&
                Objects.equals(closestTaskAt, other.closestTaskAt) &&
                Objects.equals(isDeleted, other.isDeleted) &&
                Objects.equals(customFields, other.customFields) &&
                Objects.equals(score, other.score) &&
                Objects.equals(sourceId, other.sourceId) &&
                Objects.equals(isPriceModifiedByRobot, other.isPriceModifiedByRobot) &&
                Objects.equals(embedded, other.embedded) &&
                Objects.equals(accountId, other.accountId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Lead{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", responsibleUserId=").append(responsibleUserId);
        sb.append(", groupId=").append(groupId);
        sb.append(", statusId=").append(statusId);
        sb.append(", pipelineId=").append(pipelineId);
        sb.append(", lossReasonId=").append(lossReasonId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", closestTaskAt=").append(closestTaskAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", customFields=").append(customFields);
        sb.append(", score=").append(score);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", isPriceModifiedByRobot=").append(isPriceModifiedByRobot);
        sb.append(", embedded=").append(embedded);
        sb.append(", accountId=").append(accountId);
        sb.append('}');
        return sb.toString();
    }
}
