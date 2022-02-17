package com.amocrm.amocrmsdk.exceptions;

import com.amocrm.amocrmsdk.objects.base.Error;

import java.util.ArrayList;

public class ApiException extends Exception {

    private String description;

    private String message;

    private Integer code;

    public ApiException(Integer code, String description, String message) {
        this.description = description;
        this.code = code;
        this.message = message;
    }

    public ApiException(Error error) {
        this(error.status(), error.title(), error.detail());
    }

    public ApiException(Integer code, String message) {
        this(code, "Unknown", message);
    }

    public ApiException(String message) {
        this(0, "Unknown", message);
    }

    public String getDescription() {
        return description;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessageRaw() { return message; }

    @Override
    public String getMessage() {
        return description + " (" + code + "): " + message;
    }
}