package com.amocrm.amocrmsdk.exceptions;

import com.amocrm.amocrmsdk.objects.base.Error;

public class ApiNotFoundException extends ApiException {
    public ApiNotFoundException(String message) {
        super(404, "Not Found", message);
    }

    public ApiNotFoundException(Error error) {
        super(error);
    }
}
