package com.anattoly.datalibrary.service.library;

import com.anattoly.datalibrary.entity.library.Author;
import com.anattoly.datalibrary.entity.library.Book;

public interface IAuthorService {

    void createAuthor(Author author);

    void deleteAuthorById(Long idAuthor);

    void addBookToAuthor(Long idAuthor, Book book);

    void updateAuthorById(Long idAuthor, Author author);
}
