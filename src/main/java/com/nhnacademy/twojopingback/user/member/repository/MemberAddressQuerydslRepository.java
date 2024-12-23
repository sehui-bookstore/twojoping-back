package com.nhnacademy.twojopingback.user.member.repository;

import com.nhnacademy.twojopingback.user.member.dto.response.address.MemberAddressResponseDto;

import java.util.List;

public interface MemberAddressQuerydslRepository {
    List<MemberAddressResponseDto> findAddressesByMemberId(long memberId);
}
