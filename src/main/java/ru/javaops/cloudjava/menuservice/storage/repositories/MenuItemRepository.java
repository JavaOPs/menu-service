package ru.javaops.cloudjava.menuservice.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;


public interface MenuItemRepository extends JpaRepository<MenuItem, Long>, CustomMenuItemRepository {

}
