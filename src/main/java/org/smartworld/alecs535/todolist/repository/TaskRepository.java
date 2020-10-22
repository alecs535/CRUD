package org.smartworld.alecs535.todolist.repository;

import org.smartworld.alecs535.todolist.models.*;
import org.springframework.data.jpa.repository.*;

/**
 * Класс - репозиторий для списка дел.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

    //List findByItemName(String title);

}