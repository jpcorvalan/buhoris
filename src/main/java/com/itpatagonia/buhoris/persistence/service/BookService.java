package com.itpatagonia.buhoris.persistence.service;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.domain.repository.LibroRepository;
import com.itpatagonia.buhoris.helper.CollectionHelper;
import com.itpatagonia.buhoris.persistence.mapper.full.BookMapper;
import com.itpatagonia.buhoris.persistence.model.Book;
import com.itpatagonia.buhoris.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class BookService implements LibroRepository {

    @Override
    public Set<LibroDTO> getAll() {
        return Set.of();
    }

    @Override
    public LibroDTO getById(long id) {
        return null;
    }
}
