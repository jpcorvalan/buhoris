package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.AuthorSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.GenreSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring", uses = {AuthorSummaryMapper.class, GenreSummaryMapper.class})
public interface BookMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "titulo"),
            @Mapping(source = "publisher", target = "editorial"),
            @Mapping(source = "language", target = "idioma"),
            @Mapping(source = "isbn", target = "isbn"),
            @Mapping(source = "publicationDate", target = "fechaPublicacion"),
            @Mapping(source = "pages", target = "paginas"),
            @Mapping(source = "summary", target = "resumen"),
            @Mapping(source = "authors", target = "autores"),
            @Mapping(source = "genres", target = "generos")
    })
    LibroDTO toDTO(Book book);
    Set<LibroDTO> toList(Set<Book> books);

    @InheritInverseConfiguration
    Book toEntity(LibroDTO libro);

}
