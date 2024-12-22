package com.nhnacademy.twojopingback.imageset.repository;

import com.nhnacademy.bookstore.imageset.entity.ReviewImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;


public interface ReviewImageRepository  extends JpaRepository<ReviewImage, Long> {
    @Modifying
    void deleteByReview_ReviewId(Long reviewId);
}
