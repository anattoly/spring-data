package com.anattoly.datalibrary.repository;

import com.anattoly.datalibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findBooksByGenreEquals(String genre);
}
