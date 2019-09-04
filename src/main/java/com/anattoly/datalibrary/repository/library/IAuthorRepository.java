package com.anattoly.datalibrary.repository.library;

import com.anattoly.datalibrary.entity.library.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorById(Long id);

}
