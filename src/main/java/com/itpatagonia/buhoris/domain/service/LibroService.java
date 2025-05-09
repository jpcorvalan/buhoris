package com.itpatagonia.buhoris.domain.service;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.domain.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Set<LibroSummaryDTO> getAll() {
        return libroRepository.getAll();
    }

    public LibroDTO getById(long id) {
        return libroRepository.getById(id);
    }

}
