package com.itpatagonia.buhoris.persistence.repository;

import com.itpatagonia.buhoris.persistence.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
