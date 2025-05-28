package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.AuthorSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.GenreSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.LanguageSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.PublisherSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = {
                PublisherSummaryMapper.class,
                LanguageSummaryMapper.class,
                AuthorSummaryMapper.class,
                GenreSummaryMapper.class
        }
)
public interface BookMapper {

    @Mappings({
            @Mapping(source = "title",           target = "titulo"),
            @Mapping(source = "isbn",            target = "isbn"),
            @Mapping(source = "publicationDate", target = "fechaPublicacion"),
            @Mapping(source = "pages",           target = "paginas"),
            @Mapping(source = "summary",         target = "resumen"),
            @Mapping(source = "isActive",        target = "activo"),
            @Mapping(source = "publisher",       target = "editorial"),
            @Mapping(source = "language",        target = "idioma"),
            @Mapping(source = "authors",         target = "autores"),
            @Mapping(source = "genres",          target = "generos")
    })
    LibroDTO toDto(Book book);
}
