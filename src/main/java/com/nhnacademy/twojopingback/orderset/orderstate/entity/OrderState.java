package com.nhnacademy.twojopingback.orderset.orderstate.entity;

import com.nhnacademy.twojopingback.orderset.orderstate.converter.OrderStateTypeConverter;
import com.nhnacademy.twojopingback.orderset.orderstate.entity.vo.OrderStateType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_state")
@NoArgsConstructor
public class OrderState {

    @Id
    @Column(name = "order_state_id", nullable = false)
    private Long orderStateId;

    @Convert(converter = OrderStateTypeConverter.class)
    @Column(name = "name", length = 20, nullable = false)
    private OrderStateType name;

    @Builder
    public OrderState(final OrderStateType name) {
        this.name = name;
    }

    public void updateName(OrderStateType newName) {
        if (newName == null) {
            throw new IllegalArgumentException("주문 상태가 없습니다.");
        }
        this.name = newName;
    }
}
