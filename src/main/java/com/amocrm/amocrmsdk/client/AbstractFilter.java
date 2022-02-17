package com.amocrm.amocrmsdk.client;

import com.amocrm.amocrmsdk.objects.base.FilterValue;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class AbstractFilter<T, R> {

    public HashMap<String, Object> buildQueryMap() {
        Field fieldlist[] = getClass().getDeclaredFields();
        HashMap<String, Object> queryData = new HashMap<>();
        for (Field field : fieldlist) {
                field.setAccessible(true);
                try {
                    Object value = field.get(this);
                    if (value != null && value instanceof FilterValue) {
                        queryData.put(field.getName(), ((FilterValue) value).getProperty());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
        }

        return queryData;
    }
}
