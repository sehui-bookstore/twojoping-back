package com.nhnacademy.twojopingback.admin.wrap.dto.response;

public record WrapUpdateResponseDto (
        Long wrapId,
        String name,
        int wrapPrice,
        boolean isActive,
        String wrapImage
) {}