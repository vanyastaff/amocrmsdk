package com.amocrm.amocrmsdk.objects.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class FilterValue<T> {

    protected final T object;

    public FilterValue(T object) {
        this.object = object;
    }

    public T getProperty() {
        return object;
    }
}
