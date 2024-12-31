package com.nhnacademy.twojopingback.point.service;

import com.nhnacademy.twojopingback.point.dto.request.CreatePointTypeRequestDto;
import com.nhnacademy.twojopingback.point.dto.request.UpdatePointTypeRequestDto;
import com.nhnacademy.twojopingback.point.dto.response.GetPointTypeResponse;
import com.nhnacademy.twojopingback.point.dto.response.UpdatePointTypeResponseDto;

import java.util.List;

public interface PointTypeService {

    Long createPointType(CreatePointTypeRequestDto dto);

    UpdatePointTypeResponseDto updatePointType(Long id, UpdatePointTypeRequestDto dto);

    List<GetPointTypeResponse> getAllActivePointTypes();
}
