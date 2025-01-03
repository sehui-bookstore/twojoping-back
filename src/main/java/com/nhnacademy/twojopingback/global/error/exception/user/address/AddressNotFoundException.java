package com.nhnacademy.twojopingback.global.error.exception.user.address;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class AddressNotFoundException extends NotFoundException {

    public AddressNotFoundException(String message, RedirectType redirectType, String url) {
        super(message, redirectType, url);
    }
}
