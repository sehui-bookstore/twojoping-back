package com.nhnacademy.twojopingback.bookset.book.dto.response;

import com.nhnacademy.twojopingback.bookset.category.dto.response.CategoryResponseDto;
import com.nhnacademy.twojopingback.bookset.contributor.dto.response.ContributorResponseDto;

import java.time.LocalDate;
import java.util.List;

public record BookCreateAPIResponseDto(
        Long bookId,
        String publisherName,
        String title,
        String description,
        LocalDate publishedDate,
        String isbn,
        int retailPrice,
        int sellingPrice,
        boolean giftWrappable,
        boolean isActive,
        int remainQuantity,
        List<ContributorResponseDto> contributorList,
        CategoryResponseDto category,
        String thumbnail
) {}
