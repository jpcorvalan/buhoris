package com.itpatagonia.buhoris.domain.dto.summary;

public class AutorSummaryDTO {
    private String nombre;
    private String apellido;

    public AutorSummaryDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
