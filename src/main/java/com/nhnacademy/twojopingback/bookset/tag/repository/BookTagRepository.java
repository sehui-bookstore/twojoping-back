package com.nhnacademy.twojopingback.bookset.tag.repository;

import com.nhnacademy.twojopingback.bookset.book.entity.Book;
import com.nhnacademy.twojopingback.bookset.tag.entity.BookTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTagRepository extends JpaRepository<BookTag, BookTag.BookTagId> {
    boolean existsByBook_BookIdAndTag_TagId(Long bookId, Long tagId);

    void deleteByBook(Book book);
}
