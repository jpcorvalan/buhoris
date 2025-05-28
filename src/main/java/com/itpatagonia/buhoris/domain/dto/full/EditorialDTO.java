package com.itpatagonia.buhoris.domain.dto.full;

import com.itpatagonia.buhoris.domain.dto.summary.PaisSummaryDTO;

import java.time.LocalDate;

public class EditorialDTO {
    private Long id;
    private String nombre;
    private PaisSummaryDTO pais;
    private String sitioWeb;
    private LocalDate fechaFundacion;
    private Boolean activo;

    public EditorialDTO() {
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

     public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
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
}
