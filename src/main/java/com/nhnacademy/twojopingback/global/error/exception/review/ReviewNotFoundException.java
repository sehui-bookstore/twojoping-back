package com.nhnacademy.twojopingback.global.error.exception.review;

import com.nhnacademy.bookstore.common.error.exception.base.NotFoundException;

public class ReviewNotFoundException extends NotFoundException {
    public ReviewNotFoundException(String message) {
        super(message);
    }
}
