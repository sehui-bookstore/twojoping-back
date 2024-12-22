package com.nhnacademy.twojopingback.admin.wrap.service;

import com.nhnacademy.twojopingback.admin.wrap.dto.request.WrapRequestDto;
import com.nhnacademy.twojopingback.admin.wrap.dto.request.WrapUpdateRequestDto;
import com.nhnacademy.twojopingback.admin.wrap.dto.response.WrapCreateResponseDto;
import com.nhnacademy.twojopingback.admin.wrap.dto.response.WrapUpdateResponseDto;

import java.util.List;

public interface WrapService {
    WrapCreateResponseDto createWrap(WrapRequestDto requestDto);

    WrapUpdateResponseDto getWrap(Long wrapId);

    List<WrapUpdateResponseDto> findAllByIsActiveTrue();

    WrapUpdateResponseDto updateWrap(Long wrapId, WrapUpdateRequestDto wrapUpdateRequestDto);

    void deleteWrap(Long wrapId);
}