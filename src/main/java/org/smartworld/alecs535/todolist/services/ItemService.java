package org.smartworld.alecs535.todolist.services;

import org.smartworld.alecs535.todolist.dao.ItemRepository;
import org.smartworld.alecs535.todolist.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void save(Item item) {
        itemRepository.save(item);
    }

    public Item getItem(String title) {
        return itemRepository.findByItemName(title);
    }
}
