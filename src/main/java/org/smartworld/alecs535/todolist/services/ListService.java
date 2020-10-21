package org.smartworld.alecs535.todolist.services;

import org.smartworld.alecs535.todolist.repository.ListRepository;
import org.smartworld.alecs535.todolist.models.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ListService {

    @Autowired
    ListRepository listRepository;

    public void save(List item) {
        listRepository.save(item);
    }

    public List getItem(String title) {
        return listRepository.findByItemName(title);
    }
}