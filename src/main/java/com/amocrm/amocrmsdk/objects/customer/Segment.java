package com.amocrm.amocrmsdk.objects.customer;

import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Segment {
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("color")
    private String color;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("available_products_price_types")
    private List<Integer> availableProductsPriceTypes;

    @SerializedName("bonus_points_conversion_rate")
    private Double bonusPointsConversionRate;

    @SerializedName("bonus_points_max_discount")
    private Integer bonusPointsMaxDiscount;

    @SerializedName("customers_count")
    private Integer customersCount;

    @SerializedName("custom_fields_values")
    private List<CustomField> customFields;

    @SerializedName("account_id")
    private Integer accountId;
}
