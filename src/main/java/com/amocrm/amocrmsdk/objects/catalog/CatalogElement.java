package com.amocrm.amocrmsdk.objects.catalog;

import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CatalogElement {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("catalog_id")
    private Integer catalog_id;

    @SerializedName("quantity")
    private Integer quantity;

    @SerializedName("created_by")
    private Integer createdBy;

    @SerializedName("updated_by")
    private Integer updatedBy;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    @SerializedName("custom_fields_values")
    private List<CustomField> customFields;

    @SerializedName("account_id")
    private Integer accountId;


}
