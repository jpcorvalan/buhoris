package com.itpatagonia.buhoris.config.seed;

import com.itpatagonia.buhoris.persistence.model.Role;
import com.itpatagonia.buhoris.persistence.repository.RoleRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleSeeder implements CommandLineRunner {

    private final RoleRepository repo;
    private final Faker faker;

    public RoleSeeder(RoleRepository languageRepository) {
        this.repo = languageRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        // Solo seed si no hay datos
        if (repo.count() == 0) {
            List<Role> roles = List.of(
                    new Role("Administrador"),
                    new Role("Lector"),
                    new Role("Editor")
            );

            repo.saveAll(roles);
        }
    }
}
