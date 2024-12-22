package com.nhnacademy.twojopingback.shipment.mapper;

import com.nhnacademy.bookstore.shipment.dto.response.CarrierResponseDto;
import com.nhnacademy.bookstore.shipment.entity.Carrier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarrierMapper {
    CarrierResponseDto toCarrierResponseDto(Carrier carrier);
}
