package com.nhnacademy.twojopingback.shipment.repository;

import com.nhnacademy.bookstore.shipment.entity.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrierRepository extends JpaRepository<Carrier, Long> {
}
