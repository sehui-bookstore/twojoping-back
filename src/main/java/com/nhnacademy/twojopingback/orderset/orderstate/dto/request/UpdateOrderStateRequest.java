package com.nhnacademy.twojopingback.orderset.orderstate.dto.request;

import com.nhnacademy.twojopingback.orderset.orderstate.entity.vo.OrderStateType;
import jakarta.validation.constraints.NotNull;

public record UpdateOrderStateRequest(

        @NotNull(message = "주문 상태가 존재하지 않습니다.")
        OrderStateType newName
) {
}
