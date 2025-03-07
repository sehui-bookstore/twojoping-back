package com.nhnacademy.twojopingback.imageset.repository;

import com.nhnacademy.twojopingback.bookset.book.entity.Book;
import com.nhnacademy.twojopingback.imageset.entity.BookImage;
import com.nhnacademy.twojopingback.imageset.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookImageRepository extends JpaRepository<BookImage, Long> {
    List<BookImage> findByBookAndImageType(Book book, String imageType);
    boolean existsByImage(Image image);
}
