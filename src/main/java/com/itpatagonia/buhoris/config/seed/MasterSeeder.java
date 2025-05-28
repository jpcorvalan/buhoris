package com.itpatagonia.buhoris.config.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MasterSeeder implements CommandLineRunner {

    private final CountrySeeder countrySeeder;
    private final LanguageSeeder languageSeeder;
    private final StatusSeeder statusSeeder;
    private final RoleSeeder roleSeeder;
    private final UserSeeder userSeeder;

    public MasterSeeder(CountrySeeder countrySeeder, LanguageSeeder languageSeeder, StatusSeeder statusSeeder, RoleSeeder roleSeeder, UserSeeder userSeeder) {
        this.countrySeeder = countrySeeder;
        this.languageSeeder = languageSeeder;
        this.statusSeeder = statusSeeder;
        this.roleSeeder = roleSeeder;
        this.userSeeder = userSeeder;
    }

    @Override
    public void run(String... args) throws Exception {
        countrySeeder.run();
        languageSeeder.run();
        statusSeeder.run();
        roleSeeder.run();
        userSeeder.run();
    }
}

