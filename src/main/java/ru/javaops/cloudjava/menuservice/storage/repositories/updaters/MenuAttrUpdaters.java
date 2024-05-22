package ru.javaops.cloudjava.menuservice.storage.repositories.updaters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class MenuAttrUpdaters {
    @Bean
    MenuAttrUpdater<String> description() {
        return null;
    }

    @Bean
    MenuAttrUpdater<String> imageUrl() {
        return null;
    }

    @Bean
    MenuAttrUpdater<String> name() {
        return null;
    }

    @Bean
    MenuAttrUpdater<BigDecimal> price() {
        return null;
    }

    @Bean
    MenuAttrUpdater<Long> timeToCook() {
        return null;
    }
}
