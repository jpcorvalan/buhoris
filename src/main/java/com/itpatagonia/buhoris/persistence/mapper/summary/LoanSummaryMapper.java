package com.itpatagonia.buhoris.persistence.mapper.summary;

import com.itpatagonia.buhoris.domain.dto.full.PrestamoDTO;
import com.itpatagonia.buhoris.domain.dto.summary.PrestamoSummaryDTO;
import com.itpatagonia.buhoris.persistence.mapper.full.StatusMapper;
import com.itpatagonia.buhoris.persistence.model.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        componentModel = "spring",
        uses = { UserSummaryMapper.class, BookSummaryMapper.class, StatusMapper.class }
)
public interface LoanSummaryMapper {

    @Mappings({
            @Mapping(source = "user",        target = "usuario"),
            @Mapping(source = "book",        target = "libro"),
            @Mapping(source = "status",      target = "estado")
    })
    PrestamoSummaryDTO toDto(Loan loan);
}

