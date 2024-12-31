package com.nhnacademy.twojopingback.refund.service.impl;

import com.nhnacademy.twojopingback.refund.dto.response.RefundResponseDto;
import com.nhnacademy.twojopingback.refund.repository.RefundRepository;
import com.nhnacademy.twojopingback.refund.service.RefundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RefundServiceImpl implements RefundService {

    private final RefundRepository refundRepository;

    @Override
    public List<RefundResponseDto> getRefunds(Long customerId) {

        return refundRepository.findRefundHistories(customerId);
    }
}
