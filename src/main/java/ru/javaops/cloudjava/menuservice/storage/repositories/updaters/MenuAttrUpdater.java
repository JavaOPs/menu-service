package ru.javaops.cloudjava.menuservice.storage.repositories.updaters;

import jakarta.persistence.criteria.CriteriaUpdate;
import lombok.AllArgsConstructor;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.MenuItem;

@AllArgsConstructor
public class MenuAttrUpdater<V> {
    public void updateAttr(CriteriaUpdate<MenuItem> criteria, UpdateMenuRequest dto) {
        //  TODO  criteria.set(attr, dtoValue);
    }
}
