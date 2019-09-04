package com.anattoly.datalibrary.controller;

import com.anattoly.datalibrary.entity.library.Book;
import com.anattoly.datalibrary.exeption.ResourceNotFoundExeption;
import com.anattoly.datalibrary.repository.library.IAuthorRepository;
import com.anattoly.datalibrary.repository.library.IBookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("library/books")
public class BookController {

    private final IBookRepository bookRepository;
    private final IAuthorRepository authorRepository;

    public BookController(IBookRepository bookRepository, IAuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @PostMapping("/authors/{authorId}")
    public Book addBook(@PathVariable(value = "authorId") Long authorId, @RequestBody Book book) {
        return authorRepository.findById(authorId).map(author -> {
            book.setAuthor(author);
            return bookRepository.save(book);
        }).orElseThrow(() -> new ResourceNotFoundExeption("Author Id " + authorId + "not found"));
    }

    @DeleteMapping("/{bookId}/authors/{authorId}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "authorId") Long authorId,
                                           @PathVariable(value = "bookId") Long bookId) {
        return bookRepository.findByIdAndAuthorId(bookId, authorId).map(book -> {
            bookRepository.deleteById(bookId);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundExeption("Book not found with id " + bookId + "and Author"));
    }

    @PostMapping()
    public List<Book> getAllBooksByGenre(@RequestParam String genre) {
        return bookRepository.findBooksByGenreEquals(genre);
    }

    @GetMapping("/authors/{authorId}")
    public List<Book> getAllBooksByAuthorId(@PathVariable(value = "authorId") Long authorId) {
        return bookRepository.findByAuthorId(authorId);

    }

    @PutMapping("/{bookId}/authors/{authorId}")
    public ResponseEntity<?> updateBook(@PathVariable(value = "bookId") Long bookId,
                           @PathVariable(value = "authorId") Long authorId,
                           @RequestBody Book book) {
        return bookRepository.findByIdAndAuthorId(bookId, authorId).map(b -> {
            bookRepository.deleteById(bookId);
            bookRepository.save(book);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundExeption("Book not found with id " + bookId + "and Author"));
    }
}
