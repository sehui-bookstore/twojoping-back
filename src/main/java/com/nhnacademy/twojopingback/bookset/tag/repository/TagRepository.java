package com.nhnacademy.twojopingback.bookset.tag.repository;

import com.nhnacademy.twojopingback.bookset.tag.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Optional<Tag> findByName(String name);

}
