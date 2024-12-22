package com.nhnacademy.twojopingback.global.error.exception.point;

import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class PointPolicyNotFoundException extends NotFoundException {
    public PointPolicyNotFoundException(String message) {
        super(message);
    }
}
