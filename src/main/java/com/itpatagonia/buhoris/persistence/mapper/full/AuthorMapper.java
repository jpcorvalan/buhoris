package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.AutorDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.BookSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Author;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring", uses = {BookSummaryMapper.class})
public interface AuthorMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "nombre"),
            @Mapping(source = "lastName", target = "apellido"),
            @Mapping(source = "birthDate", target = "fechaNacimiento"),
            @Mapping(source = "nationality", target = "nacionalidad"),
            @Mapping(source = "biography", target = "biografia"),
            @Mapping(source = "books", target = "libros")
    })
    AutorDTO toDTO(Author author);
    Set<AutorDTO> toList(Set<Author> authors);

    @InheritInverseConfiguration
    Author toEntity(AutorDTO autor);
}
