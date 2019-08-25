package com.anattoly.datalibrary.service;

import com.anattoly.datalibrary.entity.Book;
import com.anattoly.datalibrary.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void insertBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBookById(Long idBook) {
        bookRepository.deleteById(idBook);
    }

    public List<Book> filteredBookByGenre(String genre) {
        return bookRepository.findBooksByGenreEquals(genre);
    }

    public void updateBookById(Long idBook, Book book) {
        bookRepository.deleteById(idBook);
        bookRepository.save(book);
    }
}
