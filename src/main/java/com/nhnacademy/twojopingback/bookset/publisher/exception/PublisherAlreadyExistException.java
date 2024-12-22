package com.nhnacademy.twojopingback.bookset.publisher.exception;

import com.nhnacademy.twojopingback.global.error.exception.base.ConflictException;

public class PublisherAlreadyExistException extends ConflictException {
    public PublisherAlreadyExistException(String message) {
        super(message);
    }
}

