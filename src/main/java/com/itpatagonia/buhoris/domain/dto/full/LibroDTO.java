package com.itpatagonia.buhoris.domain.dto.full;

import java.time.LocalDate;
import java.util.Set;

public class LibroDTO {
    private Long id;
    private String titulo;
    private Set<AutorDTO> autores;
    private Set<GeneroDTO> generos;
    private EditorialDTO editorial;
    private IdiomaDTO idioma;
    private String isbn;
    private LocalDate fechaPublicacion;
    private Integer paginas;
    private String resumen;

    public LibroDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AutorDTO> getAutores() {
        return autores;
    }

    public void setAutores(Set<AutorDTO> autores) {
        this.autores = autores;
    }

    public Set<GeneroDTO> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<GeneroDTO> generos) {
        this.generos = generos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EditorialDTO getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialDTO editorial) {
        this.editorial = editorial;
    }

    public IdiomaDTO getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaDTO idioma) {
        this.idioma = idioma;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
