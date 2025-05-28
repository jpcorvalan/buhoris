package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.PrestamoDTO;
import com.itpatagonia.buhoris.persistence.mapper.summary.BookSummaryMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.UserSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = {UserSummaryMapper.class, BookSummaryMapper.class, StatusMapper.class }
)
public interface LoanMapper {

    @Mappings({
            @Mapping(source = "loanDate",    target = "fechaPrestamo"),
            @Mapping(source = "dueDate",     target = "fechaVencimiento"),
            @Mapping(source = "returnDate",  target = "fechaDevolucion"),
            @Mapping(source = "user",        target = "usuario"),
            @Mapping(source = "book",        target = "libro"),
            @Mapping(source = "status",      target = "estado")
    })
    PrestamoDTO toDto(Loan loan);
}

