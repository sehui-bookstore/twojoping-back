package com.nhnacademy.twojopingback.shipment.repository;

import com.nhnacademy.twojopingback.shipment.entity.ShipmentPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentPolicyRepository extends JpaRepository<ShipmentPolicy, Long>, ShipmentPolicyRepositoryCustom {
}
