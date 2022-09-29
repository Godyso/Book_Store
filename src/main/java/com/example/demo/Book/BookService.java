package com.example.demo.Book;

import java.util.List;

public interface BookService {
    String save(Book book);


    List<Book> getBookByISBN(long isbn);
}
