package com.amocrm.amocrmsdk.objects.contact;

import com.amocrm.amocrmsdk.objects.catalog.CatalogElement;
import com.amocrm.amocrmsdk.objects.company.Company;
import com.amocrm.amocrmsdk.objects.customer.Customer;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.amocrm.amocrmsdk.objects.tag.Tag;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ContactEmbedded {

    @SerializedName("tags")
    private List<Tag> tags;

    @SerializedName("leads")
    private List<Lead> leads;

    @SerializedName("customers")
    private List<Customer> customers;

    @SerializedName("companies")
    private List<Company> companies;

    @SerializedName("catalog_elements")
    private List<CatalogElement> catalogElements;

    @Override
    public int hashCode() {
        return Objects.hash(tags, leads, customers, companies, catalogElements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEmbedded embedded = (ContactEmbedded) o;
        return Objects.equals(tags, embedded.tags) &&
                Objects.equals(leads, embedded.leads) &&
                Objects.equals(companies, embedded.companies) &&
                Objects.equals(customers, embedded.customers) &&
                Objects.equals(catalogElements, embedded.catalogElements);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ContactEmbedded{");
        sb.append("tags=").append(tags);
        sb.append(", leads=").append(leads);
        sb.append(", companies=").append(companies);
        sb.append(", customers=").append(customers);
        sb.append(", catalogElements=").append(catalogElements);
        sb.append('}');
        return sb.toString();
    }
}
