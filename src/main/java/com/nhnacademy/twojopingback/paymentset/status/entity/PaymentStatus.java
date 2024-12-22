package com.nhnacademy.twojopingback.paymentset.status.entity;

import com.nhnacademy.twojopingback.paymentset.status.enums.PaymentStatusType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "status")
public class PaymentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;

    @Column(name = "name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private PaymentStatusType statusType;
}
