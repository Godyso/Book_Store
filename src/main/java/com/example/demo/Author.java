package com.example.demo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Author {
    private String fName;
    private String lName;
    private String bio;
    private String publisher;
}
