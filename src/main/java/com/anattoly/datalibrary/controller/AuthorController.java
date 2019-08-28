package com.anattoly.datalibrary.controller;

import com.anattoly.datalibrary.entity.Author;
import com.anattoly.datalibrary.repository.IAuthorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("library/author")
public class AuthorController {

    private final IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        authorRepository.save(author);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }


}
