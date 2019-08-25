package com.anattoly.datalibrary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book")
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", length = 100)
    private String title;
    @Column(name = "title", length = 20)
    private String genre;
    @Column(name = "title", length = 500)
    private String description;
    @Column(name = "rate")
    private Float rate;

    public Book() {
    }
}
