package com.graphql.demo.server.resolvers;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.server.model.Author;
import com.graphql.demo.server.model.Book;
import com.graphql.demo.server.util.DataRecords;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

  public Iterable<Book> findAllBooks() {
    return DataRecords.bookData;
  }

  public Book bookById(String bookId) {
    return DataRecords.bookData
            .stream()
            .filter(book -> book.getId().equals(bookId))
            .findFirst()
            .orElse(null);
  }

  public Author authorById(String authorId) {
    return DataRecords.authorData
            .stream()
            .filter(author -> author.getId().equals(authorId))
            .findFirst()
            .orElse(null);
  }
}