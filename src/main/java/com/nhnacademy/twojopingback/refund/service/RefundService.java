package com.nhnacademy.twojopingback.refund.service;

import com.nhnacademy.twojopingback.refund.dto.response.RefundResponseDto;

import java.util.List;

public interface RefundService {
    List<RefundResponseDto> getRefunds(Long customerId);
}
