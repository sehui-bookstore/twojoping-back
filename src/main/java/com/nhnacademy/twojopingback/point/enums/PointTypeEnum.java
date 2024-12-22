package com.nhnacademy.twojopingback.point.enums;

import lombok.Getter;

@Getter
public enum PointTypeEnum {

    PERCENT("Percentage based points"),
    ACTUAL("Actual points");

    private final String description;

    PointTypeEnum(String description) {
        this.description = description;
    }

}
