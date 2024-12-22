package com.nhnacademy.twojopingback.paymentset.paymentmethod.repository;

import com.nhnacademy.twojopingback.paymentset.paymentmethod.entity.PaymentMethod;
import com.nhnacademy.twojopingback.paymentset.paymentmethod.enums.PaymentMethodType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    Optional<PaymentMethod> findByPaymentMethodType(PaymentMethodType type);
}
