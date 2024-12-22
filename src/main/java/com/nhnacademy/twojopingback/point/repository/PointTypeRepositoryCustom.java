package com.nhnacademy.twojopingback.point.repository;

import com.nhnacademy.bookstore.point.dto.response.GetPointTypeResponse;

import java.util.List;

public interface PointTypeRepositoryCustom {

    List<GetPointTypeResponse> findAllActivePointTypes();
}
