package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.EstadoDTO;
import com.itpatagonia.buhoris.persistence.model.Status;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StatusMapper {

    @Mapping(source = "name", target = "nombre")
    EstadoDTO toDto(Status status);

}

