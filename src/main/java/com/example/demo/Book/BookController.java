package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //Allows an admin to create a book
    @PostMapping("/admin/addBook")
    public String saveBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @GetMapping("/book/{isbn}")
    public List<Book> getBookByISBN(@PathVariable("isbn")long isbn){
        return bookService.getBookByISBN(isbn);

    }





}
