package org.smartworld.alecs535.todolist;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * Приложение "TODO List" (список дел)
 */
@SpringBootApplication
public class TodolistApplication {

    /**
     * @param args Метод main
     */
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
