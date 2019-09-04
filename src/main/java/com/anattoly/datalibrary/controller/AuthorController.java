package com.anattoly.datalibrary.controller;

import com.anattoly.datalibrary.entity.library.Author;
import com.anattoly.datalibrary.exeption.ResourceNotFoundExeption;
import com.anattoly.datalibrary.repository.library.IAuthorRepository;
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
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

    @PutMapping("/update/{authorId}")
    public ResponseEntity<?> updateAuthor(@PathVariable(value = "authorId") Long authorId,
                                          @RequestBody Author authorRequest) {
        return authorRepository.findById(authorId).map(author -> {
            author.setFirstName(authorRequest.getFirstName());
            author.setLastName(authorRequest.getLastName());
            authorRepository.save(author);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundExeption("Author id " + authorId + " not found"));
    }
}
