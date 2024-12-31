package com.nhnacademy.twojopingback.coupon.dto.request;

import com.nhnacademy.twojopingback.coupon.enums.DiscountType;

public record UpdateCouponPolicyRequest(

        String name,
        DiscountType discountType,
        Integer discountValue,
        Integer usageLimit,
        Integer duration,
        String detail,
        Integer maxDiscount,
        Boolean isActive
) {
}
