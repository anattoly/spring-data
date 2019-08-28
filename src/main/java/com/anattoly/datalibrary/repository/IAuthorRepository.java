package com.anattoly.datalibrary.repository;

import com.anattoly.datalibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorById(Long id);

}
