package com.itpatagonia.buhoris.domain.dto.full;

import com.itpatagonia.buhoris.domain.dto.summary.AutorSummaryDTO;
import com.itpatagonia.buhoris.domain.dto.summary.EditorialSummaryDTO;
import com.itpatagonia.buhoris.domain.dto.summary.GeneroSummaryDTO;
import com.itpatagonia.buhoris.domain.dto.summary.IdiomaSummaryDTO;

import java.time.LocalDate;
import java.util.Set;

public class LibroDTO {
    private Long id;
    private String titulo;
    private String isbn;
    private LocalDate fechaPublicacion;
    private Integer paginas;
    private String resumen;
    private Boolean activo;
    private EditorialSummaryDTO editorial;
    private IdiomaSummaryDTO idioma;
    private Set<AutorSummaryDTO> autores;
    private Set<GeneroSummaryDTO> generos;

    public LibroDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public EditorialSummaryDTO getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialSummaryDTO editorial) {
        this.editorial = editorial;
    }

    public IdiomaSummaryDTO getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaSummaryDTO idioma) {
        this.idioma = idioma;
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
}

