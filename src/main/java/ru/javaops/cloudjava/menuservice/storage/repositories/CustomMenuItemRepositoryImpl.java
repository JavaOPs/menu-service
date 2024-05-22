package ru.javaops.cloudjava.menuservice.storage.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.cloudjava.menuservice.dto.SortBy;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.Category;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem_;
import ru.javaops.cloudjava.menuservice.storage.repositories.updaters.MenuAttrUpdater;

import java.util.List;

@Repository
public class CustomMenuItemRepositoryImpl implements CustomMenuItemRepository {

    private final EntityManager em;
    private final List<MenuAttrUpdater<?>> updaters;

    public CustomMenuItemRepositoryImpl(EntityManager em, List<MenuAttrUpdater<?>> updaters) {
        this.em = em;
        this.updaters = updaters;
    }

    @Transactional
    @Override
    public int updateMenu(Long id, UpdateMenuRequest dto) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<MenuItem> сriteriaUpdate = cb.createCriteriaUpdate(MenuItem.class);
        Root<MenuItem> root = сriteriaUpdate.from(MenuItem.class);
        updaters.forEach(updater -> updater.updateAttr(сriteriaUpdate, dto));
        сriteriaUpdate.where(cb.equal(root.get(MenuItem_.id), id));
        return em.createQuery(сriteriaUpdate).executeUpdate();
    }

    @Override
    public List<MenuItem> getMenusFor(Category category, SortBy sortBy) {
        // TODO
        return null;
    }
}
