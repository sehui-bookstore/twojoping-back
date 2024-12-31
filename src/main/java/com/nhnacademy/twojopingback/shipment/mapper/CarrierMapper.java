package com.nhnacademy.twojopingback.shipment.mapper;

import com.nhnacademy.twojopingback.shipment.dto.response.CarrierResponseDto;
import com.nhnacademy.twojopingback.shipment.entity.Carrier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarrierMapper {
    CarrierResponseDto toCarrierResponseDto(Carrier carrier);
}
