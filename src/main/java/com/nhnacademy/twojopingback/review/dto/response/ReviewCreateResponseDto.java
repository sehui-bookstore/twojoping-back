package com.nhnacademy.twojopingback.review.dto.response;

import java.sql.Timestamp;


public record ReviewCreateResponseDto(
        Long reviewId,
        int ratingValue,
        String title,
        String text,
        String reviewImage,
        Timestamp createdAt
)
{}
