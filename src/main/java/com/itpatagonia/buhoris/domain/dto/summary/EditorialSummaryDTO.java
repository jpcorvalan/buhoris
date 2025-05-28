package com.itpatagonia.buhoris.domain.dto.summary;

import java.time.LocalDate;

public class EditorialSummaryDTO {
    private String nombre;
    private PaisSummaryDTO pais;

    public EditorialSummaryDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PaisSummaryDTO getPais() {
        return pais;
    }

    public void setPais(PaisSummaryDTO pais) {
        this.pais = pais;
    }
}
