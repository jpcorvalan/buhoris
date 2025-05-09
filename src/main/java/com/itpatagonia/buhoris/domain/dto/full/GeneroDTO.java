package com.itpatagonia.buhoris.domain.dto.full;

import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;

import java.util.Set;

public class GeneroDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Set<LibroSummaryDTO> libros;

    public GeneroDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<LibroSummaryDTO> getLibros() {
        return libros;
    }

    public void setLibros(Set<LibroSummaryDTO> libros) {
        this.libros = libros;
    }
}
