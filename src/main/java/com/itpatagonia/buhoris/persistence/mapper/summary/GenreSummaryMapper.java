package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.GeneroDTO;
import com.itpatagonia.buhoris.domain.dto.summary.GeneroSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring"
)
public interface GenreSummaryMapper {

    @Mapping(source = "name",       target = "nombre")
    GeneroSummaryDTO toDto(Genre genre);
}
