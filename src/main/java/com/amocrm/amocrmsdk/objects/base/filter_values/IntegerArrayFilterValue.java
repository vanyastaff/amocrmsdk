package com.amocrm.amocrmsdk.objects.base.filter_values;

import com.amocrm.amocrmsdk.objects.base.FilterValue;

import java.util.Arrays;
import java.util.Collection;

public class IntegerArrayFilterValue extends FilterValue<Collection<Integer>> {

    public IntegerArrayFilterValue(Integer value) {
        super(Arrays.asList(value));
    }

    public IntegerArrayFilterValue(Collection<Integer> object) {
        super(object);
    }
}
