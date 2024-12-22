package com.nhnacademy.twojopingback.like.service;

import com.nhnacademy.twojopingback.like.dto.LikeRequestDto;
import com.nhnacademy.twojopingback.like.dto.LikeResponseDto;
import com.nhnacademy.twojopingback.like.dto.response.MemberLikeResponseDto;

import java.util.List;

public interface LikeService {

    /**
     * 책에 좋아요를 설정하는 메서드
     *
     * @param request 좋아요 요청 정보
     * @return LikeResponseDto
     */
    LikeResponseDto setBookLike(LikeRequestDto request, Long customerId);

    /**
     * 특정 책의 좋아요 개수를 조회하는 메서드
     *
     * @param bookId 책 ID
     * @return Long
     */
    Long getLikeCount(Long bookId);

    /**
     * 특정 사용자가 좋아요를 누른 책 목록을 조회하는 메서드
     *
     * @param customerId 사용자 ID
     * @return List<Book> 좋아요를 누른 책 목록
     */
    List<MemberLikeResponseDto> getBooksLikedByCustomer(Long customerId);


    /**
     * 좋아요를 취소하는 메서드
     *
     * @param request 좋아요 요청 정보
     * @return LikeResponseDto
     */
}

