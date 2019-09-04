package com.anattoly.datalibrary.entity.library;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq")
    private Long id;

    @NonNull
    @Size(max = 100)
    private String title;

    @NonNull
    @Size(max = 20)
    private String genre;

    @Size()
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    @JsonBackReference
    private Author author;

    private Double rate;

    public Book(String title, String genre, String description, Author author, Double rate) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.rate = rate;
    }

    public Book() {
    }
}
