package com.amocrm.amocrmsdk.objects.catalog;

import com.google.gson.annotations.SerializedName;

public class Catalog {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("sort")
    private Integer sort;

    @SerializedName("created_by")
    private Integer createdBy;

    @SerializedName("updated_by")
    private Integer updatedBy;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("can_add_elements")
    private Boolean canAddElements;

    @SerializedName("can_show_in_cards")
    private Boolean canShowInCards;

    @SerializedName("can_link_multiple")
    private Boolean canLinkMultiple;

    @SerializedName("can_be_deleted")
    private Boolean canBeDeleted;

    @SerializedName("sdk_widget_code")
    private String sdkWidgetCode;

    @SerializedName("account_id")
    private Integer accountId;
}
