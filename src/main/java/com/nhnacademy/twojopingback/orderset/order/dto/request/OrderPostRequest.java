package com.nhnacademy.twojopingback.orderset.order.dto.request;

import jakarta.validation.constraints.NotNull;

public record OrderPostRequest(
        @NotNull
        String status,

        @NotNull
        String orderId,

        @NotNull
        String paymentKey,

        @NotNull
        String method // 결제수단
) {
}
