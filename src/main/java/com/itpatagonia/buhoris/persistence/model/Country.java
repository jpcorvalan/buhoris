package com.itpatagonia.buhoris.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "iso_code3", length = 3, nullable = false, unique = true)
    private String isoCode3;

    @Column(name = "numeric_code", nullable = false)
    private Integer numericCode;

    public Country() {}
}
