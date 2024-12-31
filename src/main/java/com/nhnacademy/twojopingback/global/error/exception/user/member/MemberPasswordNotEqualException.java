package com.nhnacademy.twojopingback.global.error.exception.user.member;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.BadRequestException;

public class MemberPasswordNotEqualException extends BadRequestException {
    public MemberPasswordNotEqualException(String message, RedirectType redirectType, String url) {
        super(message, redirectType, url);
    }
}
