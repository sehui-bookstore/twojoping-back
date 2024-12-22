package com.nhnacademy.twojopingback.global.error.exception.bookset.contributor;

import com.nhnacademy.bookstore.common.error.exception.base.NotFoundException;

public class ContributorRoleNotFoundException extends NotFoundException {
    public static final String MESSAGE = "해당 기여자 역할이 없습니다.";
    public ContributorRoleNotFoundException() {
        super(MESSAGE);
    }
}
