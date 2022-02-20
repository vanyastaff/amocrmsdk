package com.amocrm.amocrmsdk.exceptions;

import com.amocrm.amocrmsdk.objects.base.Error;

public class ExceptionMapper {
    public static ApiException parseException(Error error) {
        switch (error.status()) {
            case 401:
                return new ApiAuthException(error);
            case 404:
                return new ApiNotFoundException(error);
            default:
                return new ApiException(error);
        }
    }
}
