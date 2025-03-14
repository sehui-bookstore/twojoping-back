package com.nhnacademy.twojopingback.point.dto.request;

import com.nhnacademy.twojopingback.point.entity.PointType;
import jakarta.annotation.Nullable;

import java.time.LocalDateTime;

public record CreateOrderPointHistoryRequest(

        @Nullable
        PointType pointType,

        @Nullable
        Long orderDetailId,

        @Nullable
        Long refundHistoryId,

        @Nullable
        Long orderId,

        Long customerId,
        Integer pointVal,
        LocalDateTime localDateTime
) {
}
