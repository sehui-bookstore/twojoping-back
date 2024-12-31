package com.nhnacademy.twojopingback.global.error.exception.orderset.order;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.BadRequestException;

public class OrderPointInvalidException extends BadRequestException {
    public OrderPointInvalidException(String message) {
        super(message, RedirectType.REDIRECT, "/");
    }
}
