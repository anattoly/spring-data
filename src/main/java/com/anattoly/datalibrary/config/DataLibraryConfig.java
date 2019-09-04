package com.anattoly.datalibrary.config;

import com.anattoly.datalibrary.repository.library.IAuthorRepository;
import com.anattoly.datalibrary.repository.library.IBookRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.anattoly.datalibrary.repository")
public class DataLibraryConfig {

    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;

    public DataLibraryConfig(IAuthorRepository authorRepository, IBookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
}
