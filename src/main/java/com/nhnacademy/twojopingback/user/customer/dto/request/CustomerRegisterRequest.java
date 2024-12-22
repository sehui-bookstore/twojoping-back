package com.nhnacademy.twojopingback.user.customer.dto.request;

public record CustomerRegisterRequest(
        String name,
        String phone,
        String email
) {
}
