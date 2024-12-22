package com.nhnacademy.twojopingback.orderset.orderstate.dto.response;

import com.nhnacademy.twojopingback.orderset.orderstate.entity.OrderState;
import com.nhnacademy.twojopingback.orderset.orderstate.entity.vo.OrderStateType;

public record GetOrderStateResponse(

        Long orderStateId,
        OrderStateType name
) {
    public static GetOrderStateResponse from(OrderState orderState) {
        return new GetOrderStateResponse(
                orderState.getOrderStateId(),
                orderState.getName()
        );
    }
}
