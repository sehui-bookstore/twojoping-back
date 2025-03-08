package com.nhnacademy.twojopingback.point.dto.response;

import com.nhnacademy.twojopingback.point.entity.PointHistory;
import jakarta.annotation.Nullable;

import java.time.LocalDateTime;

public record GetSimplePointHistoriesResponse(

        @Nullable
        String name,

        @Nullable
        Integer accVal,

        LocalDateTime registerDate
) {
    public static GetSimplePointHistoriesResponse from(PointHistory entity) {
        return new GetSimplePointHistoriesResponse(
                entity.getPointType().getName(),
                entity.getPointType().getAccVal(),
                entity.getRegisterDate()
        );
    }
}
