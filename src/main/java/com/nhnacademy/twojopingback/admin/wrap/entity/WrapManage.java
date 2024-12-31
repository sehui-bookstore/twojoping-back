package com.nhnacademy.twojopingback.admin.wrap.entity;

import com.nhnacademy.twojopingback.orderset.orderdetail.entity.OrderDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wrap_manage", uniqueConstraints = {@UniqueConstraint(columnNames = {"wrap_id", "order_detail_id"})})
public class WrapManage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wrap_manage_id", nullable = false)
    private Long wrapManageId;

    @ManyToOne
    @JoinColumn(name = "wrap_id", nullable = false)
    private Wrap wrap;

    @ManyToOne
    @JoinColumn(name = "order_detail_id", nullable = false)
    private OrderDetail orderDetail;
}
