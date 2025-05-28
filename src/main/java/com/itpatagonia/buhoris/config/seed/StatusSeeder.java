package com.itpatagonia.buhoris.config.seed;

import com.itpatagonia.buhoris.persistence.model.Status;
import com.itpatagonia.buhoris.persistence.repository.StatusRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatusSeeder implements CommandLineRunner {

    private final StatusRepository repo;
    private final Faker faker;

    public StatusSeeder(StatusRepository languageRepository) {
        this.repo = languageRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        // Solo seed si no hay datos
        if (repo.count() == 0) {
            List<Status> statuses = List.of(
                    new Status("En préstamo"),
                    new Status("Finalizado"),
                    new Status("Vencido")
            );

            repo.saveAll(statuses);
        }
    }
}
