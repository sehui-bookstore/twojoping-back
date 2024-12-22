package com.nhnacademy.twojopingback.paymentset.status.exception;

import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class PaymentStatusNotFoundException extends NotFoundException {

    public PaymentStatusNotFoundException() {
        super("결제상태가 존재하지 않습니다.");
    }
}
