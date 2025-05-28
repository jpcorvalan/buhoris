package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring"
)
public interface BookSummaryMapper {

    @Mappings({
            @Mapping(source = "title",           target = "titulo"),
            @Mapping(source = "isbn",            target = "isbn")
    })
    LibroSummaryDTO toDto(Book book);
}
