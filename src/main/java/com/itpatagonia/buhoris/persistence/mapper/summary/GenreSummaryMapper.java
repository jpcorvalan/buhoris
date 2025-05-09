package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.summary.GeneroSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface GenreSummaryMapper {

    @Mappings({
            @Mapping(source = "name", target = "nombre")
    })
    GeneroSummaryDTO toSummaryDTO(Genre genre);
    Set<GeneroSummaryDTO> toList(Set<Genre> genres);

}
