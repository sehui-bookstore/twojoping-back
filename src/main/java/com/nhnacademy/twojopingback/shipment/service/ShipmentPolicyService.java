package com.nhnacademy.twojopingback.shipment.service;

import com.nhnacademy.twojopingback.shipment.dto.request.ShipmentPolicyRequestDto;
import com.nhnacademy.twojopingback.shipment.dto.response.ShipmentPolicyResponseDto;
import com.nhnacademy.twojopingback.shipment.dto.response.ShippingFeeResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShipmentPolicyService {
    ShipmentPolicyResponseDto createShipmentPolicy(ShipmentPolicyRequestDto requestDto);
    ShipmentPolicyResponseDto getShipmentPolicy(Long shipmentPolicyId);
    Page<ShipmentPolicyResponseDto> getAllShipmentPolicies(Pageable pageable);
    ShipmentPolicyResponseDto updateShipmentPolicy(Long shipmentPolicyId, ShipmentPolicyRequestDto requestDto);
    void deactivateShipmentPolicy(Long shipmentPolicyId);
    void activateShipmentPolicy(Long shipmentPolicyId);
    List<ShipmentPolicyResponseDto> getAllIsActiveShipmentPolicies();
    List<ShippingFeeResponseDto> getShippingFee(Boolean isLogin);
}
