package com.nhnacademy.twojopingback.review.mapper;


import com.nhnacademy.twojopingback.review.dto.response.ReviewCreateResponseDto;
import com.nhnacademy.twojopingback.review.dto.response.ReviewModifyResponseDto;
import com.nhnacademy.twojopingback.review.dto.response.ReviewResponseDto;
import com.nhnacademy.twojopingback.review.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);


    @Mapping(source = "imageUrl", target = "reviewImage")
    ReviewCreateResponseDto toCreateResponseDto(Review review);


    @Mapping(source = "imageUrl", target = "reviewImage")
    ReviewModifyResponseDto toModifyResponseDto(Review review);

    @Mapping(source = "orderDetail.orderDetailId", target = "orderDetailId")
    @Mapping(source = "member.id", target = "customerId")
    @Mapping(source = "book.bookId", target = "bookId")
    @Mapping(source = "imageUrl", target = "reviewImage")
    ReviewResponseDto toResponseDto(Review review);
}
