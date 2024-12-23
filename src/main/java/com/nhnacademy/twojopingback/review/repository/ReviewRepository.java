package com.nhnacademy.twojopingback.review.repository;

import com.nhnacademy.twojopingback.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    boolean existsByOrderDetail_OrderDetailId(Long orderDetailId);

}
