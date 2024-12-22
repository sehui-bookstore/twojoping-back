package com.nhnacademy.twojopingback.bookset.contributor.dto.response;

public record ContributorIsActiveResponseDto(
        Long contributorId,
        Long contributorRoleId,
        String name,
        Boolean isActive
) {}

