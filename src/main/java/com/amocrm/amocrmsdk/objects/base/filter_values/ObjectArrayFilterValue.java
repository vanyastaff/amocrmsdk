package com.amocrm.amocrmsdk.objects.base.filter_values;

import com.amocrm.amocrmsdk.objects.base.FilterValue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class ObjectArrayFilterValue extends FilterValue<Collection<Map<String, Object>>> {

    public ObjectArrayFilterValue(Map<String, Object> ...object) {
        super(Arrays.asList(object));
    }

    public ObjectArrayFilterValue(Collection<Map<String, Object>> object) {
        super(object);
    }
}
