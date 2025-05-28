package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.AutorDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.BookSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.CountrySummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = {CountrySummaryMapper.class, BookSummaryMapper.class }
)
public interface AuthorMapper {

    @Mappings({
            @Mapping(source = "firstName",    target = "nombre"),
            @Mapping(source = "lastName",     target = "apellido"),
            @Mapping(source = "birthDate",    target = "fechaNacimiento"),
            @Mapping(source = "biography",    target = "biografia"),
            @Mapping(source = "isActive",     target = "activo"),
            @Mapping(source = "country",      target = "pais"),
            @Mapping(source = "books",        target = "libros")
    })
    AutorDTO toDto(Author author);
}

