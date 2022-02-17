package com.amocrm.amocrmsdk.objects.account;

import com.amocrm.amocrmsdk.objects.base.Links;
import com.amocrm.amocrmsdk.objects.task.entities.TaskType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Account {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("subdomain")
    private String subdomain;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("created_by")
    private Integer createdBy;

    @SerializedName("updated_at")
    private Integer updatedAt;

    @SerializedName("updated_by")
    private Integer updatedBy;

    @SerializedName("current_user_id")
    private Integer currentUserId;

    @SerializedName("country")
    private String country;

    @SerializedName("currency")
    private String currency;

    @SerializedName("currency_symbol")
    private String currencySymbol;

    @SerializedName("customers_mode")
    private String customersMode;

    @SerializedName("is_unsorted_on")
    private Boolean isUnsortedOn;

    @SerializedName("is_loss_reason_enabled")
    private Boolean isLossReasonEnabled;

    @SerializedName("is_technical_account")
    private Boolean isTechnicalAccount;

    @SerializedName("mobile_feature_version")
    private Integer mobileFeatureVersion;

    @SerializedName("contact_name_display_order")
    private Integer contactNameDisplayOrder;

    @SerializedName("amojo_id")
    private String amojoId;

    @SerializedName("version")
    private Integer version;

    @SerializedName("_links")
    private Links links;

    @SerializedName("_embedded")
    private AccountEmbedded embedded;

    public int hashCode() {
        return Objects.hash(id, name, subdomain, createdAt, createdBy, updatedAt, updatedBy, currentUserId, country, currency, currencySymbol, customersMode, isUnsortedOn, isLossReasonEnabled, isTechnicalAccount, mobileFeatureVersion, contactNameDisplayOrder, amojoId, version, links, embedded);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account other = (Account) o;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(subdomain, other.subdomain) &&
                Objects.equals(createdAt, other.createdAt) &&
                Objects.equals(createdBy, other.createdBy) &&
                Objects.equals(updatedAt, other.updatedAt) &&
                Objects.equals(updatedBy, other.updatedBy) &&
                Objects.equals(currentUserId, other.currentUserId) &&
                Objects.equals(country, other.country) &&
                Objects.equals(currency, other.currency) &&
                Objects.equals(currencySymbol, other.currencySymbol) &&
                Objects.equals(customersMode, other.customersMode) &&
                Objects.equals(isUnsortedOn, other.isUnsortedOn) &&
                Objects.equals(isLossReasonEnabled, other.isLossReasonEnabled) &&
                Objects.equals(isTechnicalAccount, other.isTechnicalAccount) &&
                Objects.equals(mobileFeatureVersion, other.mobileFeatureVersion) &&
                Objects.equals(contactNameDisplayOrder, other.contactNameDisplayOrder) &&
                Objects.equals(amojoId, other.amojoId) &&
                Objects.equals(version, other.version) &&
                Objects.equals(links, other.links) &&
                Objects.equals(embedded, other.embedded);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subdomain=").append(subdomain);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", currentUserId=").append(currentUserId);
        sb.append(", country=").append(country);
        sb.append(", currency=").append(currency);
        sb.append(", currencySymbol=").append(currencySymbol);
        sb.append(", customersMode=").append(customersMode);
        sb.append(", isUnsortedOn=").append(isUnsortedOn);
        sb.append(", isLossReasonEnabled=").append(isLossReasonEnabled);
        sb.append(", isTechnicalAccount=").append(isTechnicalAccount);
        sb.append(", mobileFeatureVersion=").append(mobileFeatureVersion);
        sb.append(", contactNameDisplayOrder=").append(contactNameDisplayOrder);
        sb.append(", mobileFeatureVersion=").append(mobileFeatureVersion);
        sb.append(", amojoId=").append(amojoId);
        sb.append(", links=").append(links);
        sb.append(", embedded=").append(embedded);
        sb.append('}');
        return sb.toString();
    }
}
