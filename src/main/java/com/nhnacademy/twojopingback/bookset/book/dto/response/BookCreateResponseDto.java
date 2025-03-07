package com.nhnacademy.twojopingback.bookset.book.dto.response;

import com.nhnacademy.twojopingback.bookset.category.dto.response.CategoryResponseDto;
import com.nhnacademy.twojopingback.bookset.contributor.dto.response.ContributorResponseDto;
import com.nhnacademy.twojopingback.bookset.tag.dto.TagResponseDto;

import java.time.LocalDate;
import java.util.List;

public record BookCreateResponseDto (
        Long bookId,
        String title,
        String description,
        String publisherName,
        LocalDate publishedDate,
        String isbn,
        int retailPrice,
        int sellingPrice,
        boolean giftWrappable,
        boolean isActive,
        int remainQuantity,
        List<ContributorResponseDto> contributorList,
        CategoryResponseDto category,
        List<TagResponseDto> tagList,
        String thumbnailImageUrl,
        String detailImageUrl
) {}