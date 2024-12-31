package com.nhnacademy.twojopingback.bookset.book.repository;

import com.nhnacademy.twojopingback.bookset.book.entity.Book;
import com.nhnacademy.twojopingback.bookset.book.entity.BookContributor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookContributorRepository extends JpaRepository<BookContributor, BookContributor.BookContributorId> {
    void deleteByBook(Book book);
}