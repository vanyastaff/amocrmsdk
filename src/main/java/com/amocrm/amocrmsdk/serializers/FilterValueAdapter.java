package com.amocrm.amocrmsdk.serializers;

import com.amocrm.amocrmsdk.objects.base.FilterValue;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class FilterValueAdapter implements JsonSerializer<FilterValue>, JsonDeserializer<FilterValue> {
    @Override
    public FilterValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if(jsonElement.isJsonArray()) {
            ArrayList arrayList = new ArrayList();
            for (JsonElement element: jsonElement.getAsJsonArray()) {
                arrayList.add(this.getPrimitiveValue(element));
            }
            return new FilterValue(arrayList);
        } else {
            Object value = this.getPrimitiveValue(jsonElement);
            return new FilterValue(value);
        }
    }

    private Object getPrimitiveValue(JsonElement jsonElement) {
        JsonPrimitive primitive = jsonElement.getAsJsonPrimitive();
        if(primitive.isNumber()) return primitive.getAsInt();
        else if(primitive.isBoolean()) return primitive.getAsBoolean();
        else if(primitive.isString()) return primitive.getAsString();
        else if (primitive.isJsonNull()) return null;
        else return null;
    }

    @Override
    public JsonElement serialize(FilterValue filterValue, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }
}
