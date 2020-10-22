package org.smartworld.alecs535.todolist.services;

import org.smartworld.alecs535.todolist.repository.*;
import org.smartworld.alecs535.todolist.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.transaction.*;
import java.util.*;

/**
 * Сервисные функции по работе с делами
 */
@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    /**
     * @param item Сохранить дело в БД
     */
    public void save(Item item) {
        itemRepository.save(item);
    }

    /**
     * @return Получить список всех дел
     */
    public List<Item> findAll() {
        return (List<Item>)itemRepository.findAll();
    }
}
