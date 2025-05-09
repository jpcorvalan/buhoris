package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.IdiomaDTO;
import com.itpatagonia.buhoris.persistence.model.Language;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface LanguageMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "codigo"),
            @Mapping(source = "name", target = "nombre"),
    })
    IdiomaDTO toDTO(Language language);
    Set<IdiomaDTO> toList(Set<Language> languages);
}
