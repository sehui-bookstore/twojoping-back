package com.nhnacademy.twojopingback.refund.service;

import com.nhnacademy.bookstore.refund.dto.response.RefundResponseDto;

import java.util.List;

public interface RefundService {
    List<RefundResponseDto> getRefunds(Long customerId);
}
