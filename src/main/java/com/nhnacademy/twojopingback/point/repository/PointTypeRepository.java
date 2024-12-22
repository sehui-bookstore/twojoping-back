package com.nhnacademy.twojopingback.point.repository;

import com.nhnacademy.twojopingback.point.entity.PointType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PointTypeRepository extends JpaRepository<PointType, Long>, PointTypeRepositoryCustom {

    Optional<PointType> findByNameAndIsActiveTrue(String name);
}
