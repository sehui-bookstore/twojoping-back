package com.nhnacademy.twojopingback.like.repository;

import com.nhnacademy.twojopingback.like.dto.response.MemberLikeResponseDto;

import java.util.List;

public interface LikeQuerydslRepository {
    List<MemberLikeResponseDto> findLikesByMember(Long memberId);
}
