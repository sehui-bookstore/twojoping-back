package com.nhnacademy.twojopingback.paymentset.status.repository;

import com.nhnacademy.twojopingback.paymentset.status.entity.PaymentStatus;
import com.nhnacademy.twojopingback.paymentset.status.enums.PaymentStatusType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Long> {
    Optional<PaymentStatus> findByStatusType(PaymentStatusType statusType);
}
