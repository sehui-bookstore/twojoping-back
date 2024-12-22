package com.nhnacademy.twojopingback.shipment.repository;

import com.nhnacademy.twojopingback.shipment.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long>, ShipmentRepositoryCustom {
}
