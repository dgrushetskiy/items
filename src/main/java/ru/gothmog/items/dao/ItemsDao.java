package ru.gothmog.items.dao;

import ru.gothmog.items.model.Items;

import java.util.List;

/**
 * @author gothmog on 05.09.2017.
 */
public interface ItemsDao extends BasicDao<Items> {

    List<Items> findAllByItemsId(long id);
}
