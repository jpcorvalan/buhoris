package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.GeneroDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.BookSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = {BookSummaryMapper.class }
)
public interface GenreMapper {

    @Mappings({
            @Mapping(source = "name",       target = "nombre"),
            @Mapping(source = "description",target = "descripcion"),
            @Mapping(source = "isActive",   target = "activo"),
            @Mapping(source = "books",      target = "libros")
    })
    GeneroDTO toDto(Genre genre);
}
