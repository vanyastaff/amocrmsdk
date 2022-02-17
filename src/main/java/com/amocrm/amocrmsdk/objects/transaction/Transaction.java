package com.amocrm.amocrmsdk.objects.transaction;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true, fluent = true)
public class Transaction {

    @Getter
    @SerializedName("id")
    public long id;

    @Getter @Setter
    @SerializedName("comment")
    protected String comment;

    @Getter @Setter
    @SerializedName("price")
    public int price;

    @Getter @Setter
    @SerializedName("customer_id")
    public  int customerId;

    @Getter @Setter
    @SerializedName("created_by")
    public int createdBy;

    @Getter @Setter
    @SerializedName("updated_by")
    public int updatedBy;

    @Getter @Setter
    @SerializedName("completed_at")
    public int completedAt;

    @Getter @Setter
    @SerializedName("created_at")
    public int createdAt;

    @Getter @Setter
    @SerializedName("updated_at")
    public int updatedAt;

    @Getter
    @SerializedName("is_deleted")
    public boolean isDeleted;

    @SerializedName("_embedded")
    protected String linkeds;
}
