package com.nhnacademy.twojopingback.bookset.publisher.exception;

import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class PublisherNotFoundException extends NotFoundException {
    public PublisherNotFoundException(String message) {
        super(message);
    }
}
