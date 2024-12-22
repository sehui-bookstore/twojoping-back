package com.nhnacademy.twojopingback.point.dto.request;

public record PointUseRequest(

        Long customerId,
        Integer pointAmount
) {
}
