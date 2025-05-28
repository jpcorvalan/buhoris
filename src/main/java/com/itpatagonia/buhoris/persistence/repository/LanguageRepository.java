package com.itpatagonia.buhoris.persistence.repository;

import com.itpatagonia.buhoris.persistence.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
}
