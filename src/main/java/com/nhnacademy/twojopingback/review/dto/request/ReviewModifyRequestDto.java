package com.nhnacademy.twojopingback.review.dto.request;


public record ReviewModifyRequestDto (
        ReviewModifyDetailRequestDto reviewModifyDetailRequestDto,
        ReviewImageUrlRequestDto reviewImageUrlRequestDto,
        boolean deleteImage
)
{}
