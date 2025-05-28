package com.itpatagonia.buhoris.domain.dto.full;

import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.domain.dto.summary.UsuarioSummaryDTO;

import java.time.LocalDate;

public class PrestamoDTO {
    private Long id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDevolucion;
    private UsuarioSummaryDTO usuario;
    private LibroSummaryDTO libro;
    private EstadoDTO estado;

    public PrestamoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
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

