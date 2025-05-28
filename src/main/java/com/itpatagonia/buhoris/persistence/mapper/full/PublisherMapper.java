package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.EditorialDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.CountrySummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = {CountrySummaryMapper.class }
)
public interface PublisherMapper {

    @Mappings({
            @Mapping(source = "name",        target = "nombre"),
            @Mapping(source = "country",     target = "pais"),
            @Mapping(source = "website",     target = "sitioWeb"),
            @Mapping(source = "foundedDate", target = "fechaFundacion"),
            @Mapping(source = "isActive",    target = "activo")
    })
    EditorialDTO toDto(Publisher publisher);
}
