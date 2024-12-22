package com.nhnacademy.twojopingback.bookset.contributor.mapper;

import com.nhnacademy.twojopingback.bookset.contributor.dto.response.ContributorRoleResponseDto;
import com.nhnacademy.twojopingback.bookset.contributor.entity.ContributorRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContributorRoleMapper {

    // ContributorRole Entity -> ContributorRoleResponseDto 변환
    ContributorRoleResponseDto toContributorRoleResponseDto(ContributorRole contributorRole);
}
