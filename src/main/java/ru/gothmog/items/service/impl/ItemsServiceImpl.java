package ru.gothmog.items.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gothmog.items.dao.ItemsDao;
import ru.gothmog.items.model.Items;
import ru.gothmog.items.service.ItemsService;

import java.util.List;

/**
 * @author gothmog on 05.09.2017.
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items addItems(Items items) {
        return itemsDao.create(items);
    }

    @Override
    public Items getById(long id) {
        return itemsDao.getById(id);
    }

    @Override
    public Items delete(long id) {
        Items itemsForDelete = itemsDao.getById(id);
        return itemsDao.delete(itemsForDelete);
    }

    @Override
    public List<Items> getList() {
        return itemsDao.getList();
    }

    @Override
    public Items update(Items items) {
        return itemsDao.update(items);
    }

    @Override
    public List<Items> findAllByItemsId(long itemsId) {
        return itemsDao.findAllByItemsId(itemsId);
    }
}
