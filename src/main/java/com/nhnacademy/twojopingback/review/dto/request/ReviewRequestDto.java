package com.nhnacademy.twojopingback.review.dto.request;

import jakarta.validation.constraints.Positive;

public record ReviewRequestDto (
        @Positive Long reviewId
) {}
