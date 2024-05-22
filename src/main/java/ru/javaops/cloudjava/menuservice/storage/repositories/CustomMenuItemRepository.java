package ru.javaops.cloudjava.menuservice.storage.repositories;

import ru.javaops.cloudjava.menuservice.dto.SortBy;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.Category;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;

import java.util.List;

public interface CustomMenuItemRepository {

    int updateMenu(Long id, UpdateMenuRequest dto);

    List<MenuItem> getMenusFor(Category category, SortBy sortBy);
}
