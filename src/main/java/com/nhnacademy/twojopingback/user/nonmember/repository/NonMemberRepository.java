package com.nhnacademy.twojopingback.user.nonmember.repository;

import com.nhnacademy.twojopingback.user.nonmember.entity.NonMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonMemberRepository extends JpaRepository<NonMember, Long> {
}
