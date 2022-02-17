package com.amocrm.amocrmsdk.constants;

public enum Entity {
    CONTACT("contacts"),
    LEAD("leads"),
    COMPANY("companies"),
    CUSTOMER("customers"),
    TASK("tasks"),
    EVENTS("events"),
    TRANSACTIONS("transactions"),
    USER("users"),
    PIPELINE("pipelines"),
    STATUS("status");

    private  final String entityName;

    Entity(String entityName) {
        this.entityName = entityName;
    }
}


