package com.amocrm.amocrmsdk.exceptions;

import com.amocrm.amocrmsdk.objects.base.Error;

public class ApiAuthException extends ApiException {
    public ApiAuthException(String message) {
        super(401, "User authorization failed", message);
    }

    public ApiAuthException(Error error) {
        super(error);
    }
}
