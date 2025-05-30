package com.itpatagonia.buhoris.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2, unique = true, nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = Boolean.TRUE;

    public Language() {}
}
