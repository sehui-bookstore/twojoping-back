package com.nhnacademy.twojopingback.bookset.book.dto.request;

public record ImageUrlRequestDto(
        String thumbnailImageUrl,
        String detailImageUrl
) {}