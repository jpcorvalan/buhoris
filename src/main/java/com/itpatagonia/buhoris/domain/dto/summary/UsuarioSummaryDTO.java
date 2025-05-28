package com.itpatagonia.buhoris.domain.dto.summary;

import com.itpatagonia.buhoris.domain.dto.full.RolDTO;

import java.time.LocalDate;

public class UsuarioSummaryDTO {
    private String nombre;
    private String apellido;
    private RolDTO rol;

    public UsuarioSummaryDTO() {
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

    public RolDTO getRol() {
        return rol;
    }

    public void setRol(RolDTO rol) {
        this.rol = rol;
    }
}

