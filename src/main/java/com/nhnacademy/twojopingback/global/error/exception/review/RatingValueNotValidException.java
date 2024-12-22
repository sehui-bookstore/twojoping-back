package com.nhnacademy.twojopingback.global.error.exception.review;


public class RatingValueNotValidException extends RuntimeException  {
    private final int invalidValue;

    public RatingValueNotValidException(String message, int invalidValue) {
        super(message);
        this.invalidValue = invalidValue;
    }

    public int getInvalidValue() {
        return invalidValue;
    }
}
