package com.nhnacademy.twojopingback.point.repository;

import com.nhnacademy.twojopingback.point.entity.PointHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointHistoryRepository extends JpaRepository<PointHistory, Long> {

    List<PointHistory> findAllByCustomerIdOrderByRegisterDateDesc(Long customerId);
}
