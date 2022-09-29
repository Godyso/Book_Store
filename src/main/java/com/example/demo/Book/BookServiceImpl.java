package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

   @Autowired
    private BookRepository repository;
    @Override
    public String save(Book book) {
        repository.save(book);
        return "Added book with ISBN:" + book.getIsbn();

    }

    @Override
    public List<Book> getBookByISBN(long isbn) {
        return repository.findByisbn(isbn);
    }

}
