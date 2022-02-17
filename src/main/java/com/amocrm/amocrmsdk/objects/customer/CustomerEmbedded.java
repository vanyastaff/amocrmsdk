package com.amocrm.amocrmsdk.objects.customer;

import com.amocrm.amocrmsdk.objects.catalog.CatalogElement;
import com.amocrm.amocrmsdk.objects.company.Company;
import com.amocrm.amocrmsdk.objects.contact.ContactEmbedded;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.amocrm.amocrmsdk.objects.tag.Tag;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;

@Data
@Accessors(fluent = true, chain = true)
public class CustomerEmbedded {
    @SerializedName("tags")
    private List<Tag> tags;

    @SerializedName("segments")
    private List<Segment> segments;

    @SerializedName("contacts")
    private List<Customer> customers;

    @SerializedName("companies")
    private List<Company> companies;

    @SerializedName("catalog_elements")
    private List<CatalogElement> catalogElements;

    @Override
    public int hashCode() {
        return Objects.hash(tags, segments, customers, companies, catalogElements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEmbedded other = (CustomerEmbedded) o;
        return Objects.equals(tags, other.tags) &&
                Objects.equals(segments, other.segments) &&
                Objects.equals(companies, other.companies) &&
                Objects.equals(customers, other.customers) &&
                Objects.equals(catalogElements, other.catalogElements);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ContactEmbedded{");
        sb.append("tags=").append(tags);
        sb.append(", segments=").append(segments);
        sb.append(", companies=").append(companies);
        sb.append(", contacts=").append(customers);
        sb.append(", catalogElements=").append(catalogElements);
        sb.append('}');
        return sb.toString();
    }
}
