package com.itpatagonia.buhoris.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String title;
    private Publisher publisher;     // relación @ManyToOne
    private Language language;       // relación @ManyToOne
    private String isbn;
    private LocalDate publicationDate;
    private Integer pages;
    private String summary;
    private Boolean isActive;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BookAuthor> authors = new HashSet<>();           // relación @ManyToMany

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BookGenre> genres = new HashSet<>();             // relación @ManyToMany

    public Book() {}
}
