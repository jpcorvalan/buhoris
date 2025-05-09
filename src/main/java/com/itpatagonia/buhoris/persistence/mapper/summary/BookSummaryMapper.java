package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.persistence.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring", uses = {AuthorSummaryMapper.class, GenreSummaryMapper.class})
public interface BookSummaryMapper {

    @Mappings({
            @Mapping(source = "title", target = "titulo"),
            @Mapping(source = "authors", target = "autores"),
            @Mapping(source = "genres", target = "generos"),
            @Mapping(source = "language", target = "idioma")
    })
    LibroSummaryDTO toSummaryDTO(Book book);
    Set<LibroSummaryDTO> toList(Set<Book> books);
}
