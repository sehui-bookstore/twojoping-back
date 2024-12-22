package com.nhnacademy.twojopingback.point.dto.response;

import com.nhnacademy.twojopingback.point.entity.PointType;
import com.nhnacademy.twojopingback.point.enums.PointTypeEnum;

/**
 * 포인트 타입 ReadPointTypeResponse DTO
 *
 * @author : 박채연
 * @date : 2024-11-18
 */

public record ReadPointTypeResponseDto(
        Long pointTypeId,
        PointTypeEnum type,
        Integer accVal,
        String name,
        boolean isActive
) {
    public static ReadPointTypeResponseDto from(PointType entity) {
        return new ReadPointTypeResponseDto(
                entity.getPointTypeId(),
                entity.getType(),
                entity.getAccVal(),
                entity.getName(),
                entity.isActive()
        );
    }
}
