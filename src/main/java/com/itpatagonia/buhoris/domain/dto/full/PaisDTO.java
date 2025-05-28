package com.itpatagonia.buhoris.domain.dto.full;

public class PaisDTO {
    private Long id;
    private String nombre;
    private String codigoIso3;
    private Integer codigoNumerico;

    public PaisDTO() {
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

    public String getCodigoIso3() {
        return codigoIso3;
    }

    public void setCodigoIso3(String codigoIso3) {
        this.codigoIso3 = codigoIso3;
    }

    public Integer getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(Integer codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }
}

