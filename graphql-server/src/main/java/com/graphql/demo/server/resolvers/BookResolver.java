package com.graphql.demo.server.resolvers;


import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.server.model.Author;
import com.graphql.demo.server.model.Book;
import com.graphql.demo.server.util.DataRecords;


public class BookResolver implements GraphQLResolver<Book> {

    public BookResolver() {
    }

    public Author author(Book book) {
        String authorId = book.getAuthorId();
        return DataRecords.authorData
                .stream()
                .filter(author -> author.getId().equals(authorId))
                .findFirst()
                .orElse(null);

    }

    /*public String name(Book book) {
        return "book-name";
    }*/
}