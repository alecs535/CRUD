package org.smartworld.alecs535.todolist.services;

import org.smartworld.alecs535.todolist.repository.*;
import org.smartworld.alecs535.todolist.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.transaction.*;
import java.util.*;

/**
 * Сервисные функции по работе со списком дел
 */
@Service
@Transactional
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    /**
     * @param task Сохранить список в БД
     */
    public void save(Task task) {
        taskRepository.save(task);
    }

    /**
     * @return Получить список всех списков дел
     */
    public List<Task> findAll() {
        return (List<Task>)taskRepository.findAll();
    }
}