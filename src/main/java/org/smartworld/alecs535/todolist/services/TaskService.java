package org.smartworld.alecs535.todolist.services;

import org.smartworld.alecs535.todolist.repository.TaskRepository;
import org.smartworld.alecs535.todolist.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public void save(Task task) {
        taskRepository.save(task);
    }

    public List<Task> findAll() {
        return (List<Task>)taskRepository.findAll();
    }
}