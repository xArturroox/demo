package com.example.demo.model;

import com.example.demo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Service
public class BookServiceImpl implements com.example.demo.BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Optional<BookTO> getBook(long id) {
        return  BookMapper.map(bookRepository.findById(id));
    }
}
