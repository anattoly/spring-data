package com.anattoly.datalibrary.repository.library;

import com.anattoly.datalibrary.entity.library.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findBooksByGenreEquals(String genre);

    List<Book> findByAuthorId(Long authorId);

    Optional<Book> findByIdAndAuthorId(Long bookId, Long authorId);
}
