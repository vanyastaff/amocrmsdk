package com.amocrm.amocrmsdk.objects.contact;

import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;

@Data
@Accessors(fluent = true, chain = true)
public class Contact {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("responsible_user_id")
    private Integer responsibleUserId;

    @SerializedName("group_id")
    private Integer groupId;

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

    @SerializedName("is_unsorted")
    private Boolean isUnsorted;

    @SerializedName("custom_fields_values")
    private List<CustomField> customFields;

    @SerializedName("_embedded")
    private ContactEmbedded embedded;

    @SerializedName("account_id")
    private Integer accountId;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstName, lastName, responsibleUserId, groupId, createdBy, updatedBy, createdAt, updatedAt, closestTaskAt, isDeleted, isUnsorted, customFields, embedded, accountId);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact other = (Contact) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName) &&
                Objects.equals(responsibleUserId, other.responsibleUserId) &&
                Objects.equals(groupId, other.groupId) &&
                Objects.equals(createdBy, other.createdBy) &&
                Objects.equals(updatedBy, other.updatedAt) &&
                Objects.equals(createdAt, other.createdAt) &&
                Objects.equals(closestTaskAt, other.closestTaskAt) &&
                Objects.equals(isDeleted, other.isDeleted) &&
                Objects.equals(isUnsorted, other.isUnsorted) &&
                Objects.equals(customFields, other.customFields) &&
                Objects.equals(embedded, other.embedded) &&
                Objects.equals(accountId, other.accountId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", responsibleUserId=").append(responsibleUserId);
        sb.append(", groupId=").append(groupId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", closestTaskAt=").append(closestTaskAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isUnsorted=").append(isUnsorted);
        sb.append(", customFields=").append(customFields);
        sb.append(", embedded=").append(embedded);
        sb.append(", accountId=").append(accountId);
        sb.append('}');
        return sb.toString();
    }
}
