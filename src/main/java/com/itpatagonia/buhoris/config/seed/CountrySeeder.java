package com.itpatagonia.buhoris.config.seed;

import com.itpatagonia.buhoris.persistence.model.Country;
import com.itpatagonia.buhoris.persistence.repository.CountryRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

@Component
public class CountrySeeder implements CommandLineRunner {

    private final CountryRepository repo;
    private final Faker faker;

    public CountrySeeder(CountryRepository languageRepository) {
        this.repo = languageRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        // Solo seed si no hay datos
        if (repo.count() == 0) {
            for (int i = 0; i < 50; i++) {
                Country ent = new Country();

                ent.setName(faker.country().name());
                ent.setIsoCode3(faker.nation().isoCountry());
                ent.setNumericCode(faker.random().nextInt());

                try {
                    repo.save(ent);
                } catch (DataIntegrityViolationException ex) {
                    // ya existe, continuar
                }
            }

        }
    }
}
