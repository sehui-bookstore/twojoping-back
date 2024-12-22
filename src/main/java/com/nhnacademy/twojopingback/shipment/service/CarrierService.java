package com.nhnacademy.twojopingback.shipment.service;

import com.nhnacademy.twojopingback.shipment.dto.request.CarrierRequestDto;
import com.nhnacademy.twojopingback.shipment.dto.response.CarrierResponseDto;

import java.util.List;

public interface CarrierService {
    CarrierResponseDto createCarrier(CarrierRequestDto requestDto);
    CarrierResponseDto getCarrier(Long carrierId);
    List<CarrierResponseDto> getAllCarriers();
    CarrierResponseDto updateCarrier(Long carrierId, CarrierRequestDto requestDto);
    void deleteCarrier(Long carrierId);
}
