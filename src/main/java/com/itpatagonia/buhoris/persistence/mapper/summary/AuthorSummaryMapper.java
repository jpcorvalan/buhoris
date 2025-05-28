package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.AutorDTO;
import com.itpatagonia.buhoris.domain.dto.summary.AutorSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = { CountrySummaryMapper.class }
)
public interface AuthorSummaryMapper {

    @Mappings({
            @Mapping(source = "firstName",    target = "nombre"),
            @Mapping(source = "lastName",     target = "apellido"),
            @Mapping(source = "country",      target = "pais")
    })
    AutorSummaryDTO toDto(Author author);
}

