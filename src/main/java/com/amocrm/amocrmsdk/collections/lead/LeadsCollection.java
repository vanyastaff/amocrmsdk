package com.amocrm.amocrmsdk.collections.lead;

import com.amocrm.amocrmsdk.objects.BaseCollection;
import com.amocrm.amocrmsdk.objects.lead.Lead;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LeadsCollection extends BaseCollection<Lead> {

    public Optional<Lead> byId(Integer id) {
        return this.stream().filter(lead -> lead.id() == id).collect(Collectors.toList()).stream().findFirst();
    }

    public Optional<Lead> byHash(Integer hash) {
        return this.stream().filter(lead -> lead.hashCode() == hash).collect(Collectors.toList()).stream().findFirst();
    }
}
