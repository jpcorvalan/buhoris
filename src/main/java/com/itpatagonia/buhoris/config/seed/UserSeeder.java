package com.itpatagonia.buhoris.config.seed;

import com.itpatagonia.buhoris.persistence.model.Role;
import com.itpatagonia.buhoris.persistence.model.User;
import com.itpatagonia.buhoris.persistence.repository.RoleRepository;
import com.itpatagonia.buhoris.persistence.repository.UserRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserSeeder implements CommandLineRunner {

    private final UserRepository repo;
    private final RoleRepository rolRepo;
    private final Faker faker;

    public UserSeeder(UserRepository languageRepository, RoleRepository rolRepo) {
        this.repo = languageRepository;
        this.rolRepo = rolRepo;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        // Solo seed si no hay datos
        if (repo.count() == 0) {
            List<Role> roles = (List<Role>) rolRepo.findAll();
            for (int i = 0; i < 100; i++) {
                User ent = new User();

                ent.setFirstName(faker.name().firstName());
                ent.setLastName(faker.name().lastName());
                ent.setDni(faker.cpf().valid());
                ent.setAddress(faker.address().fullAddress());
                ent.setEmail(faker.internet().emailAddress());
                ent.setBirthDate(faker.timeAndDate().birthday());
                ent.setRole(roles.get(faker.random().nextInt(roles.size())));

                repo.save(ent);
            }

        }
    }
}
