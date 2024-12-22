package com.nhnacademy.twojopingback.global.error.exception.coupon;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class CouponPolicyNotFoundException extends NotFoundException {
    public CouponPolicyNotFoundException(String message, RedirectType redirectType, String url) {
        super(message, redirectType, url);
    }
}
