package org.smartworld.alecs535.todolist.dao;

import org.smartworld.alecs535.todolist.models.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Long> {

    List findByItemName(String title);

}