package com.nhnacademy.twojopingback.point.dto.request;

public record OrderPointAwardRequest(

        Long customerId,
        Long orderId
) {
}
