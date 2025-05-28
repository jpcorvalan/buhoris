package com.itpatagonia.buhoris.domain.dto.summary;

import java.time.LocalDate;
import java.util.Set;

public class LibroSummaryDTO {
    private String titulo;
    private String isbn;

    public LibroSummaryDTO() {
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
}

