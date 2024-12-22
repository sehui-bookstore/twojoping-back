package com.nhnacademy.twojopingback.shipment.repository.impl;

import com.nhnacademy.twojopingback.shipment.dto.response.ShipmentResponseDto;
import com.nhnacademy.twojopingback.shipment.entity.QShipment;
import com.nhnacademy.twojopingback.shipment.entity.Shipment;
import com.nhnacademy.twojopingback.shipment.repository.ShipmentRepositoryCustom;
import com.querydsl.core.types.Projections;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.time.LocalDateTime;
import java.util.List;

public class ShipmentRepositoryImpl extends QuerydslRepositorySupport implements ShipmentRepositoryCustom {

    public ShipmentRepositoryImpl() {
        super(Shipment.class);
    }

    @Override
    public List<ShipmentResponseDto> findAllShipmentDtos() {
        QShipment shipment = QShipment.shipment;

        return from(shipment)
                .select(Projections.constructor(ShipmentResponseDto.class,
                        shipment.shipmentId,
                        shipment.carrier.carrierId,
                        shipment.shipmentPolicy.shipmentPolicyId,
                        shipment.order.orderId,
                        shipment.requirement,
                        shipment.shippingDate,
                        shipment.deliveryDate,
                        shipment.trackingNumber))
                .fetch();
    }

    @Override
    public List<ShipmentResponseDto> findCompletedShipmentDtos(LocalDateTime now) {
        QShipment shipment = QShipment.shipment;

        return from(shipment)
                .select(Projections.constructor(ShipmentResponseDto.class,
                        shipment.shipmentId,
                        shipment.carrier.carrierId,
                        shipment.shipmentPolicy.shipmentPolicyId,
                        shipment.order.orderId,
                        shipment.requirement,
                        shipment.shippingDate,
                        shipment.deliveryDate,
                        shipment.trackingNumber))
                .where(shipment.deliveryDate.isNotNull()
                        .and(shipment.deliveryDate.before(now)))
                .fetch();
    }

    @Override
    public List<ShipmentResponseDto> findPendingShipmentDtos(LocalDateTime now) {
        QShipment shipment = QShipment.shipment;

        return from(shipment)
                .select(Projections.constructor(ShipmentResponseDto.class,
                        shipment.shipmentId,
                        shipment.carrier.carrierId,
                        shipment.shipmentPolicy.shipmentPolicyId,
                        shipment.order.orderId,
                        shipment.requirement,
                        shipment.shippingDate,
                        shipment.deliveryDate,
                        shipment.trackingNumber))
                .where(shipment.deliveryDate.isNull()
                        .or(shipment.deliveryDate.after(now)))
                .fetch();
    }
}
