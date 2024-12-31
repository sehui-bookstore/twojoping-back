package com.nhnacademy.twojopingback.bookset.contributor.service;

import com.nhnacademy.twojopingback.bookset.contributor.dto.request.ContributorRoleRequestDto;
import com.nhnacademy.twojopingback.bookset.contributor.dto.response.ContributorRoleResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContributorRoleService {
    ContributorRoleResponseDto createContributorRole(ContributorRoleRequestDto dto);
    ContributorRoleResponseDto getContributorRole(Long contributorRoleId);
    ContributorRoleResponseDto updateContributorRole(Long contributorRoleId, ContributorRoleRequestDto dto);
    void deleteContributorRole(Long contributorRoleId);
    List<ContributorRoleResponseDto> getAllContributorRoles();
}
