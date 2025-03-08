package com.nhnacademy.twojopingback.point.service.impl;

import com.nhnacademy.twojopingback.point.dto.request.CreateOrderPointHistoryRequest;
import com.nhnacademy.twojopingback.point.dto.request.CreatePointUseHistoryUseRequest;
import com.nhnacademy.twojopingback.point.dto.request.CreateReviewPointHistoryRequest;
import com.nhnacademy.twojopingback.point.entity.PointHistory;
import com.nhnacademy.twojopingback.point.repository.PointHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PointHistoryService {

    private final PointHistoryRepository pointHistoryRepository;

    @Transactional
    public Long createReviewPointHistory(CreateReviewPointHistoryRequest request) {
        PointHistory pointHistory = PointHistory.builder()
                .pointType(request.pointType())
                .orderDetailId(request.orderDetailId())
                .refundHistoryId(request.refundHistoryId())
                .orderId(request.orderId())
                .customerId(request.customerId())
                .pointVal(request.pointVal())
                .registerDate(LocalDateTime.now())
                .build();

        return pointHistoryRepository.save(pointHistory).getPointTypeHistoryId();
    }

    @Transactional
    public Long createOrderPointHistory(CreateOrderPointHistoryRequest request) {
        PointHistory pointHistory = PointHistory.builder()
                .pointType(request.pointType())
                .orderDetailId(request.orderDetailId())
                .refundHistoryId(request.refundHistoryId())
                .orderId(request.orderId())
                .customerId(request.customerId())
                .pointVal(request.pointVal())
                .registerDate(LocalDateTime.now())
                .build();

        return pointHistoryRepository.save(pointHistory).getPointTypeHistoryId();
    }

    @Transactional
    public Long createPointUseHistory(CreatePointUseHistoryUseRequest request) {
        PointHistory pointHistory = PointHistory.builder()
                .pointType(request.pointType())
                .orderDetailId(request.orderDetailId())
                .refundHistoryId(request.refundHistoryId())
                .orderId(request.orderId())
                .customerId(request.customerId())
                .pointVal(request.pointVal())
                .registerDate(LocalDateTime.now())
                .build();

        return pointHistoryRepository.save(pointHistory).getPointTypeHistoryId();
    }
}
