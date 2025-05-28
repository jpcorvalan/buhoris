package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.PaisDTO;
import com.itpatagonia.buhoris.persistence.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mappings({
            @Mapping(source = "name",       target = "nombre"),
            @Mapping(source = "isoCode3",   target = "codigoIso3"),
            @Mapping(source = "numericCode",target = "codigoNumerico")
    })
    PaisDTO toDto(Country country);
}

