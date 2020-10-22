package org.smartworld.alecs535.todolist.repository;

import org.smartworld.alecs535.todolist.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    //List findByItemName(String title);

}