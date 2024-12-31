package com.nhnacademy.twojopingback.user.memberstatus.repository;

import com.nhnacademy.twojopingback.user.memberstatus.entity.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberStatusRepository extends JpaRepository<MemberStatus, Long> {
}
