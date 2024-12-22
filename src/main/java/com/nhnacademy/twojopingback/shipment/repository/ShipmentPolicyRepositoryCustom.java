package com.nhnacademy.twojopingback.shipment.repository;

import com.nhnacademy.twojopingback.shipment.dto.response.ShipmentPolicyResponseDto;
import com.nhnacademy.twojopingback.shipment.dto.response.ShippingFeeResponseDto;

import java.util.List;

public interface ShipmentPolicyRepositoryCustom {
    List<ShipmentPolicyResponseDto> findActiveShipmentPolicies();
    List<ShippingFeeResponseDto> findActiveShippingFee(Boolean isMember);
}
