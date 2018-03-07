package com.example.demo.model;

import com.example.demo.BookEntity;

import java.util.Optional;

public final class BookMapper {

    public static Optional<BookTO> map(Optional<BookEntity> book) {
       return book.map(BookMapper::map);
    }
    public static BookTO map(BookEntity book) {
       return new BookTO(book.getId(),book.getName());
    }
}
