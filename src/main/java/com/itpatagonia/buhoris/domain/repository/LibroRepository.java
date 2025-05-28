package com.itpatagonia.buhoris.domain.repository;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;

import java.util.Set;

public interface LibroRepository {
    Set<LibroDTO> getAll();
    LibroDTO getById(long id);
}
