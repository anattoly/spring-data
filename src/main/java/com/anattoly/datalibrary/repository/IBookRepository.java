package com.anattoly.datalibrary.repository;

import com.anattoly.datalibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findBooksByGenreEquals(String genre);

    List<Book> findByAuthorId(Long authorId);

    Optional<Book> findByIdAndAuthorId(Long bookId, Long authorId);

    
}
