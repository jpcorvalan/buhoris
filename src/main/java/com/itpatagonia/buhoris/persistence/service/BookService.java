package com.itpatagonia.buhoris.persistence.service;

import com.itpatagonia.buhoris.domain.dto.full.LibroDTO;
import com.itpatagonia.buhoris.domain.dto.summary.LibroSummaryDTO;
import com.itpatagonia.buhoris.domain.repository.LibroRepository;
import com.itpatagonia.buhoris.helper.CollectionHelper;
import com.itpatagonia.buhoris.persistence.mapper.full.BookMapper;
import com.itpatagonia.buhoris.persistence.mapper.summary.BookSummaryMapper;
import com.itpatagonia.buhoris.persistence.model.Book;
import com.itpatagonia.buhoris.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.Optional;
import java.util.Set;

public class BookService implements LibroRepository {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookSummaryMapper bookSummaryMapper;

    @Override
    public Set<LibroSummaryDTO> getAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Set<Book> books = CollectionHelper.toSet(bookRepository.findAll(sort));

        return bookSummaryMapper.toList(books);
    }

    @Override
    public LibroDTO getById(long id) {
        Optional<Book> foundBook = bookRepository.findById(id);

        if (foundBook.isEmpty()) return null;

        return bookMapper.toDTO(foundBook.get());
    }
}
