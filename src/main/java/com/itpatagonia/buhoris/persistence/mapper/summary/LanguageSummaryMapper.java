package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.IdiomaDTO;
import com.itpatagonia.buhoris.domain.dto.summary.IdiomaSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Language;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LanguageSummaryMapper {

    @Mapping(source = "name",      target = "nombre")
    IdiomaSummaryDTO toDto(Language language);
}

