package com.nhnacademy.twojopingback.paymentset.paymenthistory.repository;

import com.nhnacademy.twojopingback.paymentset.paymenthistory.entity.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {

}
