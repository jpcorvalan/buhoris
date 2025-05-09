package com.itpatagonia.buhoris.domain.repository;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;

import java.util.Set;

public interface LibroRepository {
    Set<LibroSummaryDTO> getAll();
    LibroDTO getById(long id);
}
