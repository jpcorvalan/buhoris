package com.itpatagonia.buhoris.domain.dto.full;

import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.domain.dto.summary.PaisSummaryDTO;

import java.time.LocalDate;
import java.util.Set;

public class AutorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String biografia;
    private Boolean activo;
    private PaisSummaryDTO pais;
    private Set<LibroSummaryDTO> libros;

    public AutorDTO() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public PaisSummaryDTO getPais() {
        return pais;
    }

    public void setPais(PaisSummaryDTO pais) {
        this.pais = pais;
    }

    public Set<LibroSummaryDTO> getLibros() {
        return libros;
    }

    public void setLibros(Set<LibroSummaryDTO> libros) {
        this.libros = libros;
    }
}

