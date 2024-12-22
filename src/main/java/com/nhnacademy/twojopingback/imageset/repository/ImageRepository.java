package com.nhnacademy.twojopingback.imageset.repository;

import com.nhnacademy.twojopingback.imageset.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findById(Long imageId);
}
