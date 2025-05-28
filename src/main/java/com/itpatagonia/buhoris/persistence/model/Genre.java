package com.itpatagonia.buhoris.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genres")
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = Boolean.TRUE;

    @ManyToMany(mappedBy = "genres")
    private Set<Book> books = new HashSet<>();

    public Genre() {
    }
}
