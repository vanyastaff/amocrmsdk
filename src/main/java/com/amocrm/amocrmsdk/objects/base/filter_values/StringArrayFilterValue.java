package com.amocrm.amocrmsdk.objects.base.filter_values;

import com.amocrm.amocrmsdk.objects.base.FilterValue;

import java.util.Arrays;
import java.util.Collection;

public class StringArrayFilterValue extends FilterValue<Collection<String>> {

    public StringArrayFilterValue(String value) {
        super(Arrays.asList(value));
    }

    public StringArrayFilterValue(Collection<String> object) {
        super(object);
    }
}
