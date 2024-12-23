package com.nhnacademy.twojopingback.global.error.exception.bookset.contributor;

import com.nhnacademy.twojopingback.global.error.exception.base.BadRequestException;

public class ContributorIsDeactivateException extends BadRequestException {
    public static final String MESSAGE = "해당 기여자가 비활성화 상태입니다.";
    public ContributorIsDeactivateException() {
        super(MESSAGE);
    }
}
