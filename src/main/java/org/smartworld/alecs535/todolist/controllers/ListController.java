package org.smartworld.alecs535.todolist.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.smartworld.alecs535.todolist.exceptions.*;

@RestController
@RequestMapping("todolist")
public class ListController {

    private int counter = 4;
    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
        add(new HashMap<String, String>() {{put("id", "1"); put("text", "First Message"); }});
        add(new HashMap<String, String>() {{put("id", "2"); put("text", "Second Message"); }});
        add(new HashMap<String, String>() {{put("id", "3"); put("text", "Third Message"); }});
    }};

    @GetMapping
    public List<Map<String, String>> list() {
        //messages.add()
        return messages;
    }

    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return getMessage(id);
    }

    private Map<String, String> getMessage(@PathVariable String id) {
        return messages.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    @PostMapping
    public Map<String, String> create(@RequestBody Map<String, String> message) {
        if(message.get("text").isEmpty()) {
            new IncorrectNameException();
        }
        message.put("id", String.valueOf(counter++));
        messages.add(message);
        return message;
    }

    @PutMapping("{id}")
    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
        Map<String, String> messageFromDB = getMessage(id);
        messageFromDB.putAll(message);
        messageFromDB.put("id", id);
        return messageFromDB;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Map<String, String> message = getMessage(id);
        messages.remove(message);
    }

}
