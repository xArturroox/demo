package com.example.demo;

import com.example.demo.model.BookTO;

import java.util.Optional;

public interface BookService {
    public Optional<BookTO> getBook(long id);
}
