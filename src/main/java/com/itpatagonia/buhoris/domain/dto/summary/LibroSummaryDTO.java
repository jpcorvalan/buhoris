package com.itpatagonia.buhoris.domain.dto.summary;

import com.itpatagonia.buhoris.domain.dto.full.IdiomaDTO;

import java.util.Set;

public class LibroSummaryDTO {
    private String titulo;
    private Set<AutorSummaryDTO> autores;
    private Set<GeneroSummaryDTO> generos;
    private IdiomaDTO idioma;

    public LibroSummaryDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<AutorSummaryDTO> getAutores() {
        return autores;
    }

    public void setAutores(Set<AutorSummaryDTO> autores) {
        this.autores = autores;
    }

    public Set<GeneroSummaryDTO> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<GeneroSummaryDTO> generos) {
        this.generos = generos;
    }

    public IdiomaDTO getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaDTO idioma) {
        this.idioma = idioma;
    }
}
