package com.nhnacademy.twojopingback.global.error.exception.bookset.book;

import com.nhnacademy.twojopingback.global.error.enums.RedirectType;
import com.nhnacademy.twojopingback.global.error.exception.base.BadRequestException;

public class BookStockOutException extends BadRequestException {
    public BookStockOutException(String message, RedirectType redirectType, String url) {
        super(message, redirectType, url);
    }
}
