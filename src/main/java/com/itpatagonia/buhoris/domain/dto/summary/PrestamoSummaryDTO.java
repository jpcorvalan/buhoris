package com.itpatagonia.buhoris.domain.dto.summary;

import com.itpatagonia.buhoris.domain.dto.full.EstadoDTO;

public class PrestamoSummaryDTO {
    private UsuarioSummaryDTO usuario;
    private LibroSummaryDTO libro;
    private EstadoDTO estado;

    public PrestamoSummaryDTO() {
    }

    public UsuarioSummaryDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioSummaryDTO usuario) {
        this.usuario = usuario;
    }

    public LibroSummaryDTO getLibro() {
        return libro;
    }

    public void setLibro(LibroSummaryDTO libro) {
        this.libro = libro;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }
}

