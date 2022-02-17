package com.amocrm.amocrmsdk.objects;

import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BaseCollection<T> extends ArrayList<T> {
    public static <T,F> List<F> pluck(String fieldName, Class<F> fieldType,
                                      List<T> list, Class<T> listType)
            throws NoSuchFieldException, IllegalAccessException {
        Field f = listType.getField(fieldName);
        ArrayList<F> result = new ArrayList<F>();
        for (T element : list) {
            result.add(fieldType.cast(f.get(element)));
        }
        return result;
    }
}
