package com.nhnacademy.twojopingback.imageset.repository;

import com.nhnacademy.twojopingback.imageset.entity.WrapImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WrapImageRepository extends JpaRepository<WrapImage, Long> {
    Optional<WrapImage> findFirstByWrap_WrapId(Long wrapId);
    void deleteByWrap_WrapId(Long wrapId);
    boolean existsByWrap_WrapId(Long wrapId);
}
