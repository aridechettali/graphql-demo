package com.graphql.demo.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String id;
    private String name;
    private String authorId;
    private int pageCount;
}