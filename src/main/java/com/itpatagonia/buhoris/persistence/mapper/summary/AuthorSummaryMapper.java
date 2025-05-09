package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.summary.AutorSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface AuthorSummaryMapper {

    @Mappings({
            @Mapping(source = "firstName", target = "nombre"),
            @Mapping(source = "lastName", target = "apellido"),
    })
    AutorSummaryDTO toSummary(Author author);
    Set<AutorSummaryDTO> toList(Set<Author> authors);

}
