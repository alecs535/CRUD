package org.smartworld.alecs535.todolist.repository;

import org.smartworld.alecs535.todolist.models.*;
import org.springframework.data.jpa.repository.*;

/**
 * Класс - репозиторий для дел.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

  //  Item findByItemTitle(String title);

}
