package com.nhnacademy.twojopingback.admin.wrap.repository;

import com.nhnacademy.twojopingback.admin.wrap.dto.response.WrapResponseDto;

import java.util.List;

public interface WrapRepositoryCustom {
    List<WrapResponseDto> findAllByIsActiveTrue();
}
