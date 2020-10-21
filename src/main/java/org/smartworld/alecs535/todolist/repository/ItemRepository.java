package org.smartworld.alecs535.todolist.repository;

import org.smartworld.alecs535.todolist.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByItemName(String title);

}
