package com.anattoly.datalibrary.controller;

import com.anattoly.datalibrary.entity.Book;
import com.anattoly.datalibrary.exeption.ResourceNotFoundExeption;
import com.anattoly.datalibrary.repository.IAuthorRepository;
import com.anattoly.datalibrary.repository.IBookRepository;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("library")
public class BookController {

    private final IBookRepository bookRepository;
    private final IAuthorRepository authorRepository;

    public BookController(IBookRepository bookRepository, IAuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @PostMapping("/{authorId}/books")
    public Book addBook(@PathVariable(value = "authorId") Long authorId, @RequestBody Book book) {
        return authorRepository.findById(authorId).map(author -> {
            book.setAuthor(author);
            return bookRepository.save(book);
        }).orElseThrow(() -> new ResourceNotFoundExeption("Author Id " + authorId + "not found"));
    }

    @GetMapping("/{authorId}/books")
    public List<Book> getAllBooksByAuthorId(@PathVariable(value = "authorId") Long authorId) {
        return bookRepository.findByAuthorId(authorId);

    }

    @DeleteMapping("/{authorId}/books/{booksId}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "authorId") Long authorId,
                                           @PathVariable(value = "booksId") Long bookId) {
        return bookRepository.findByIdAndAuthorId(bookId, authorId).map(book -> {
            bookRepository.deleteById(bookId);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundExeption("Book not found with id " + bookId + "and Author"));
    }

    @PostMapping("/books")
    public List<Book> getAllBooksByGenre(@RequestParam String genre) {
        return bookRepository.findBooksByGenreEquals(genre);
    }
}
