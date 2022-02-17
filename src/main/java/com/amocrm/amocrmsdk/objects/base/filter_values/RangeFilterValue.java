package com.amocrm.amocrmsdk.objects.base.filter_values;

import com.amocrm.amocrmsdk.objects.base.FilterValue;

import java.util.HashMap;
import java.util.Map;

public class RangeFilterValue extends FilterValue<Map<String, Integer>> {

    public RangeFilterValue(Integer from, Integer to) {
        super(createMap(from, to));
    }

    public RangeFilterValue(Map<String, Integer> object) {
        super(object);
    }

    private static Map<String, Integer> createMap(Integer from, Integer to) {
        Map<String, Integer> range = new HashMap<String, Integer>();
        if(from != null) range.put("from", from);
        if(to != null) range.put("to", to);
        return range;
    }
}
