package com.amocrm.amocrmsdk.serializers;

import com.amocrm.amocrmsdk.objects.base.CustomField;
import com.amocrm.amocrmsdk.objects.base.custom_fields.*;
import com.google.gson.*;

import java.lang.reflect.Type;

public class CustomFieldAdapter implements JsonSerializer<CustomField>, JsonDeserializer<CustomField> {

    @Override
    public JsonElement serialize(CustomField customField, Type type, JsonSerializationContext jsonSerializationContext) {
        Type clasName = customField.getClass();
        return null;
    }

    @Override
    public CustomField deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String fieldType = jsonObject.get("field_type").getAsString();
        switch (fieldType) {
            case "text":
                return new Gson().fromJson(jsonObject, TextField.class);
            case "textarea":
                return new Gson().fromJson(jsonObject, TextareaField.class);
            case "multitext":
                return new Gson().fromJson(jsonObject, MultiTextField.class);
            case "numeric":
                return new Gson().fromJson(jsonObject, NumericField.class);
            case "price":
                return new Gson().fromJson(jsonObject, PriceField.class);
            case "date":
                return new Gson().fromJson(jsonObject, DateField.class);
            case "date_time":
                return new Gson().fromJson(jsonObject, DateTimeField.class);
            case "birthday":
                return new Gson().fromJson(jsonObject, BirthdayField.class);
            case "checkbox":
                return new Gson().fromJson(jsonObject, CheckboxField.class);
            case "radio":
                return new Gson().fromJson(jsonObject, RadioField.class);
            case "select":
                return new Gson().fromJson(jsonObject, SelectField.class);
            case "multiselect":
                return new Gson().fromJson(jsonObject, MultiSelectField.class);
            case "tracking_data":
                return new Gson().fromJson(jsonObject, TrackingField.class);
            case "url":
                return new Gson().fromJson(jsonObject, UrlField.class);
            case "streetaddress":
                return new Gson().fromJson(jsonObject, StreetAddressField.class);
            case "smart_address":
                return new Gson().fromJson(jsonObject, SmartAddressField.class);
            case "org_legal_name":
                return new Gson().fromJson(jsonObject, OrgLegalNameField.class);
            case "linked_entity":
                return new Gson().fromJson(jsonObject, LinkedEntityField.class);
            case "legal_entity":
                return new Gson().fromJson(jsonObject, LegalEntityField.class);
            case "items":
                return new Gson().fromJson(jsonObject, ItemsField.class);
            case "gua":
                return new Gson().fromJson(jsonObject, GuaField.class);
            default:
                return new Gson().fromJson(jsonObject, CustomField.class);
        }
    }
}
