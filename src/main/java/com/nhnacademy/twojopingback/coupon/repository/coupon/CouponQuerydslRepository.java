package com.nhnacademy.twojopingback.coupon.repository.coupon;

import com.nhnacademy.twojopingback.coupon.dto.response.CouponResponseDto;

import java.util.List;

public interface CouponQuerydslRepository {

    List<CouponResponseDto> findAllCoupons();
}
