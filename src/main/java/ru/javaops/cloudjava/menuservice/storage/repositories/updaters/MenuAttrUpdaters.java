package ru.javaops.cloudjava.menuservice.storage.repositories.updaters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem_;

import java.math.BigDecimal;

@Configuration
public class MenuAttrUpdaters {
    @Bean
    MenuAttrUpdater<String> description() {
        return new MenuAttrUpdater<>(MenuItem_.description, UpdateMenuRequest::getDescription);
    }

    @Bean
    MenuAttrUpdater<String> imageUrl() {
        return new MenuAttrUpdater<>(MenuItem_.imageUrl, UpdateMenuRequest::getImageUrl);
    }

    @Bean
    MenuAttrUpdater<String> name() {
        return new MenuAttrUpdater<>(MenuItem_.name, UpdateMenuRequest::getName);
    }

    @Bean
    MenuAttrUpdater<BigDecimal> price() {
        return new MenuAttrUpdater<>(MenuItem_.price, UpdateMenuRequest::getPrice);
    }

    @Bean
    MenuAttrUpdater<Long> timeToCook() {
        return new MenuAttrUpdater<>(MenuItem_.timeToCook, UpdateMenuRequest::getTimeToCook);
    }
}
