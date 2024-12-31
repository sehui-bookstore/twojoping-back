package com.nhnacademy.twojopingback.bookset.publisher.repository;

import com.nhnacademy.twojopingback.bookset.publisher.dto.response.PublisherResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PublisherRepositoryCustom {
    Page<PublisherResponseDto> findAllBy(Pageable pabeable);
}
