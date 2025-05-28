package com.itpatagonia.buhoris.config.seed;

import com.itpatagonia.buhoris.persistence.model.Language;
import com.itpatagonia.buhoris.persistence.repository.LanguageRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

@Component
public class LanguageSeeder implements CommandLineRunner {

    private final LanguageRepository repo;
    private final Faker faker;

    public LanguageSeeder(LanguageRepository languageRepository) {
        this.repo = languageRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        // Solo seed si no hay datos
        if (repo.count() == 0) {
            for (int i = 0; i < 20; i++) {
                Language ent = new Language();

                ent.setCode(faker.languageCode().iso639());
                ent.setName(faker.nation().language());
                ent.setIsActive(true);

                try {
                    repo.save(ent);
                } catch (DataIntegrityViolationException ex) {
                    // ya existe, continuar
                }
            }
        }
    }
}
