package com.itpatagonia.buhoris.persistence.repository;

import com.itpatagonia.buhoris.persistence.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
