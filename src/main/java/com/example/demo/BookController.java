package com.example.demo;

import com.example.demo.model.BookTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "book")
    public BookTO getBook(@RequestParam long id){
        return bookService.getBook(id).orElse(null);
    }
}
