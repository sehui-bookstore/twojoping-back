package com.nhnacademy.twojopingback.point.service;

import com.nhnacademy.twojopingback.point.dto.request.OrderPointAwardRequest;
import com.nhnacademy.twojopingback.point.dto.request.PointUseRequest;
import com.nhnacademy.twojopingback.point.dto.request.ReviewPointAwardRequest;
import com.nhnacademy.twojopingback.point.dto.response.GetMyPageDetailPointHistoriesResponse;
import com.nhnacademy.twojopingback.point.dto.response.GetMyPageSimplePointHistoriesResponse;

public interface PointService {

    void awardReviewPoint(ReviewPointAwardRequest request);
    void awardOrderPoint(OrderPointAwardRequest request);
    void usePoint(PointUseRequest request);

    GetMyPageSimplePointHistoriesResponse getMyPageSimplePointHistories(Long customerId);
    GetMyPageDetailPointHistoriesResponse getMyPageDetailPointHistories(Long customerId);
}
