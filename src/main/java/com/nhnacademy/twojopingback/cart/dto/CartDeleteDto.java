package com.nhnacademy.twojopingback.cart.dto;

import jakarta.validation.constraints.NotNull;

public record CartDeleteDto(@NotNull(message = "필수") Long bookId) {
}
