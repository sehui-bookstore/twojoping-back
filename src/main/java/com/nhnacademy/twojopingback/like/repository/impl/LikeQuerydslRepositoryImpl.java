package com.nhnacademy.twojopingback.like.repository.impl;

import com.nhnacademy.twojopingback.bookset.book.entity.QBook;
import com.nhnacademy.twojopingback.imageset.entity.QBookImage;
import com.nhnacademy.twojopingback.like.dto.response.MemberLikeResponseDto;
import com.nhnacademy.twojopingback.like.entity.QLike;
import com.nhnacademy.twojopingback.like.repository.LikeQuerydslRepository;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LikeQuerydslRepositoryImpl implements LikeQuerydslRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<MemberLikeResponseDto> findLikesByMember(Long memberId) {
        QLike like = QLike.like;
        QBook book = QBook.book;
        QBookImage bookImage = QBookImage.bookImage;

        return queryFactory.select(Projections.constructor(MemberLikeResponseDto.class,
                        like.likeId,
                        book.bookId,
                        bookImage.image.url, // 책의 첫 번째 이미지를 가져옴
                        book.title
                ))
                .from(like)
                .join(like.book, book)
                .leftJoin(bookImage).on(bookImage.book.eq(book).and(bookImage.imageType.eq("썸네일"))) // 대표 이미지 조건
                .where(like.member.id.eq(memberId))
                .distinct() // 중복 제거
                .fetch();
    }
}