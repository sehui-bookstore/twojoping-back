package com.nhnacademy.twojopingback.refund.repository;

import com.nhnacademy.twojopingback.refund.dto.response.RefundResponseDto;

import java.util.List;

public interface RefundQuerydslRepository {
    List<RefundResponseDto> findRefundHistories(Long customerId);
}
