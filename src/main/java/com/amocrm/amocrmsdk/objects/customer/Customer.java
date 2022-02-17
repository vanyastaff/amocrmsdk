package com.amocrm.amocrmsdk.objects.customer;

import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;

@Data
@Accessors(fluent = true, chain = true)
public class Customer {
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("next_price")
    private Integer nextPrice;

    @SerializedName("next_date")
    private Integer nextDate;

    @SerializedName("responsible_user_id")
    private Integer responsibleUserId;

    @SerializedName("status_id")
    private Integer statusId;

    @SerializedName("periodicity")
    private Integer periodicity;

    @SerializedName("created_by")
    private Integer createdBy;

    @SerializedName("updated_by")
    private Integer updatedBy;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("closest_task_at")
    private Integer closestTaskAt;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    @SerializedName("custom_fields_values")
    private List<CustomField> customFields;

    @SerializedName("ltv")
    private Integer ltv;

    @SerializedName("purchases_count")
    private Integer purchasesCount;

    @SerializedName("average_check")
    private  Integer averageCheck;

    @SerializedName("_embedded")
    private CustomerEmbedded embedded;

    @SerializedName("account_id")
    private Integer accountId;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nextPrice, nextDate, responsibleUserId, statusId, periodicity, createdBy, updatedBy, createdAt, updatedAt, closestTaskAt, isDeleted, customFields, ltv, purchasesCount, averageCheck, embedded, accountId);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer other = (Customer) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(nextPrice, other.nextDate) &&
                Objects.equals(responsibleUserId, other.responsibleUserId) &&
                Objects.equals(statusId, other.statusId) &&
                Objects.equals(periodicity, other.periodicity) &&
                Objects.equals(createdBy, other.createdBy) &&
                Objects.equals(updatedBy, other.updatedAt) &&
                Objects.equals(createdAt, other.createdAt) &&
                Objects.equals(closestTaskAt, other.closestTaskAt) &&
                Objects.equals(isDeleted, other.isDeleted) &&
                Objects.equals(customFields, other.customFields) &&
                Objects.equals(ltv, other.ltv) &&
                Objects.equals(purchasesCount, other.purchasesCount) &&
                Objects.equals(averageCheck, other.averageCheck) &&
                Objects.equals(embedded, other.embedded) &&
                Objects.equals(accountId, other.accountId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", nextPrice=").append(nextPrice);
        sb.append(", nextDate=").append(nextDate);
        sb.append(", responsibleUserId=").append(responsibleUserId);
        sb.append(", statusId=").append(statusId);
        sb.append(", periodicity=").append(periodicity);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", closestTaskAt=").append(closestTaskAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", customFields=").append(customFields);
        sb.append(", ltv=").append(ltv);
        sb.append(", purchasesCount=").append(purchasesCount);
        sb.append(", averageCheck=").append(averageCheck);
        sb.append(", embedded=").append(embedded);
        sb.append(", accountId=").append(accountId);
        sb.append('}');
        return sb.toString();
    }
}
