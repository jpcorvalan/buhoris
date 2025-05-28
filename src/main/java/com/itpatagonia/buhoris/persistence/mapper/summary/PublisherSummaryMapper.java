package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.EditorialDTO;
import com.itpatagonia.buhoris.domain.dto.summary.EditorialSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = { CountrySummaryMapper.class }
)
public interface PublisherSummaryMapper {

    @Mappings({
            @Mapping(source = "name",        target = "nombre"),
            @Mapping(source = "country",     target = "pais")
    })
    EditorialSummaryDTO toDto(Publisher publisher);
}
