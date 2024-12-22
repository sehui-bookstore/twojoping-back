package com.nhnacademy.twojopingback.common.error.exception.user.address;

import com.nhnacademy.bookstore.common.error.enums.RedirectType;
import com.nhnacademy.bookstore.common.error.exception.base.ConflictException;

import java.io.Serializable;

/**
 * AddressLimitToTenException
 * 회원 주소 제한 초과 예외 클래스입니다. 회원이 등록할 수 있는 최대 주소 개수(10개)를 초과했을 때 발생하는 예외입니다.
 * 기본적으로 HTTP 409 Conflict 상태를 나타내며, 추가적으로 리다이렉션 타입, URL, 데이터를 포함할 수 있습니다.
 *
 * @author Luha
 * @since 1.0
 */
public class AddressLimitToTenException extends ConflictException {

    /**
     * AddressLimitToTenException 생성자.
     *
     * @param message       예외 메시지
     * @param redirectType  리다이렉션 타입 (예: REDIRECT, FORWARD 등)
     * @param url           리다이렉션 대상 URL
     * @param data          추가 데이터 (필요한 경우)
     * @since 1.0
     * @see ConflictException
     */
    public AddressLimitToTenException(String message, RedirectType redirectType, String url, Serializable data) {
        super(message, redirectType, url, data);
    }

}
