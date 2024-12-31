package com.nhnacademy.twojopingback.imageset.entity;

import com.nhnacademy.twojopingback.bookset.book.entity.Book;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "book_image")
public class BookImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_image_id")
    private Long bookImageId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "image_id", nullable = false)
    private Image image;

    @NonNull
    @Column(name = "image_type", nullable = false)
    private String imageType;
}