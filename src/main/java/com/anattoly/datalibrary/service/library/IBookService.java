package com.anattoly.datalibrary.service.library;


import com.anattoly.datalibrary.entity.library.Book;

import java.util.List;

public interface IBookService {

    void insertBook(Book book);

    void deleteBookById(Long idBook);

    List<Book> filteredBookByGenre(String genre);

    void updateBookById(Long idBook, Book book);

    List<Book> filteredBookByAuthor(Long idAuthor);
}
