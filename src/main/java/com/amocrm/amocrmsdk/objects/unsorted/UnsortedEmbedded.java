package com.amocrm.amocrmsdk.objects.unsorted;

import com.amocrm.amocrmsdk.objects.company.Company;
import com.amocrm.amocrmsdk.objects.contact.Contact;
import com.amocrm.amocrmsdk.objects.lead.Lead;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Objects;

public class UnsortedEmbedded {

    @SerializedName("contacts")
    public Collection<Contact> contacts;

    @SerializedName("companies")
    public Collection<Company> companies;

    @SerializedName("leads")
    public Collection<Lead> leads;

    @Override
    public int hashCode() {
        return Objects.hash(contacts, companies, leads);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnsortedEmbedded other = (UnsortedEmbedded) o;
        return Objects.equals(contacts, other.contacts) &&
                Objects.equals(companies, other.companies) &&
                Objects.equals(leads, other.leads);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnsortedEmbedded{");
        sb.append("contacts=").append(contacts);
        sb.append(", companies=").append(companies);
        sb.append(", leads=").append(leads);
        sb.append('}');
        return sb.toString();
    }
}
