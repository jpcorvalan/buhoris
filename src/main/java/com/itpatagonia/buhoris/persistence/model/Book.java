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
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 13, unique = true)
    private String isbn;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    private Integer pages;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = Boolean.FALSE;

    // ------ Relaciones ------

    @OneToOne(mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false)
    private BookStock stock;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private Set<Loan> loans = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @ManyToMany
    @JoinTable(
            name = "book_authors",
            joinColumns =  @JoinColumn(name = "book_id"),
            inverseJoinColumns =  @JoinColumn(name = "author_id")
    )
    private Set<Author> authors = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "book_genres",
            joinColumns =  @JoinColumn(name = "book_id"),
            inverseJoinColumns =  @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>();

    public Book() {}
}
