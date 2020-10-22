package org.smartworld.alecs535.todolist.controllers;

import org.smartworld.alecs535.todolist.models.*;
import org.smartworld.alecs535.todolist.services.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.smartworld.alecs535.todolist.exceptions.*;

/**
 * Класс-контроллер дел.
 */
@RestController
@RequestMapping("todolist")
public class ItemController {

    /** Сервисные функции по работе с делами */
    private ItemService itemService;

    /** @return Функция выдачи всех дел */
    @GetMapping("/item")
    public List<Item> allItem() {
        return itemService.findAll();
    }

}
