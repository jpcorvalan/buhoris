package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.PaisDTO;
import com.itpatagonia.buhoris.domain.dto.summary.PaisSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CountrySummaryMapper {

    @Mappings({
            @Mapping(source = "name",       target = "nombre")
    })
    PaisSummaryDTO toDto(Country country);
}

