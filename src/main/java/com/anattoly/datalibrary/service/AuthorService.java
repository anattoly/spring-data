package com.anattoly.datalibrary.service;

import com.anattoly.datalibrary.entity.Author;
import com.anattoly.datalibrary.entity.Book;
import com.anattoly.datalibrary.repository.IAuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {

    private final IAuthorRepository authorRepository;

    public AuthorService(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthorById(Long idAuthor) {
        authorRepository.deleteById(idAuthor);
    }

    @Override
    public void addBookToAuthor(Long idAuthor, Book book) {

    }

    @Override
    public void updateAuthorById(Long idAuthor, Author author) {

    }

}
