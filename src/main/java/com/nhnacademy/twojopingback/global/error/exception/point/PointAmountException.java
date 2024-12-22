package com.nhnacademy.twojopingback.global.error.exception.point;

import com.nhnacademy.bookstore.common.error.exception.base.NotFoundException;

public class PointAmountException extends NotFoundException {
    public PointAmountException(String message) {
        super(message);
    }
}
