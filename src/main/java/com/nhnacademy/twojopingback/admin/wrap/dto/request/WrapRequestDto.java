package com.nhnacademy.twojopingback.admin.wrap.dto.request;

public record WrapRequestDto (
        WrapDetailRequestDto wrapDetailRequestDto,
        WrapImageUrlRequestDto imageUrlRequestDto
) {}