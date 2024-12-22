package com.nhnacademy.twojopingback.shipment.dto.response;

public record ShippingFeeResponseDto(
        Long shipmentPolicyId,
        Integer minOrderAmount,
        Integer shippingFee
) {
}