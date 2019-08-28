package com.anattoly.datalibrary.service;

import com.anattoly.datalibrary.entity.Author;
import com.anattoly.datalibrary.entity.Book;

public interface IAuthorService {

    void createAuthor(Author author);

    void deleteAuthorById(Long idAuthor);

    void addBookToAuthor(Long idAuthor, Book book);

    void updateAuthorById(Long idAuthor, Author author);
}
