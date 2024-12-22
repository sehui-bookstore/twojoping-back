package com.nhnacademy.twojopingback.bookset.book.repository;

import com.nhnacademy.twojopingback.bookset.book.entity.Book;
import com.nhnacademy.twojopingback.bookset.book.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, BookCategory.BookCategoryId> {
    void deleteByBook(Book book);
}