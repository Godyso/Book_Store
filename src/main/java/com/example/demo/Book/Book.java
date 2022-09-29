package com.example.demo.Book;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Book {

    @Id
    private String id;
    private long isbn;
    private String name;
   /* private String description;
    private double price;
    private String author;
    private String genre;
    private String publisher;
    private int year;
    private int sold;*/

}
