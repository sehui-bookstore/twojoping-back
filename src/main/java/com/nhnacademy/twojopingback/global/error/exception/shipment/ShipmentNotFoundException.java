package com.nhnacademy.twojopingback.global.error.exception.shipment;

import com.nhnacademy.twojopingback.global.error.exception.base.NotFoundException;

public class ShipmentNotFoundException extends NotFoundException {
    public static final String MESSAGE = "해당 배송 정보가 없습니다.";
    public ShipmentNotFoundException() {
        super(MESSAGE);
    }
}
