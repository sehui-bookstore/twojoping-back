package com.nhnacademy.twojopingback.user.customer.dto.response;

import com.nhnacademy.twojopingback.user.customer.entity.Customer;

public record CustomerWithMemberStatusResponse(
        Customer customer,
        Boolean isMember
) {
}
