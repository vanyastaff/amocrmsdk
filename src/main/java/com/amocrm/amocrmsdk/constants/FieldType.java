package com.amocrm.amocrmsdk.constants;

public enum FieldType {
    TEXT("text"),
    NUMERIC("numeric"),
    CHECKBOX("checkbox"),
    SELECT("select"),
    MULTISELECT("multiselect"),
    DATE("date"),
    URL("url"),
    TEXTAREA("textarea"),
    RADIOBUTTON("radiobutton"),
    STREETADDRESS("streetaddress"),
    SMARTADDRESS("smart_address"),
    BIRTHDAY("birthday"),
    LEGALENTITY("legal_entity"),
    DATETIME("date_time"),
    PRICE("price"),
    CATEGORY("category"),
    ITEMS("items"),
    TRACKINGDATA("tracking_data");

    private String fieldType;

    FieldType(String fieldType) {
        this.fieldType = fieldType;
    }
}
