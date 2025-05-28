package com.itpatagonia.buhoris.persistence.repository;

import com.itpatagonia.buhoris.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Optional<Book> findById(long id);
    Optional<Book> findByTitle(String title);
    Optional<Book> findByIsbn(String isbn);
}
