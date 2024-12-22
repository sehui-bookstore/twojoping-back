package com.nhnacademy.twojopingback.global.error.exception.coupon;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.BadRequestException;

public class CouponInvalidException extends BadRequestException {
    public CouponInvalidException(String message) {
        super(message, RedirectType.REDIRECT, "/");
    }
}
