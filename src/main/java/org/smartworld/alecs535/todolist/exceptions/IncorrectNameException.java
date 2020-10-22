package org.smartworld.alecs535.todolist.exceptions;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * Класс ошибки некорректного имени объекта.
 */
@ResponseStatus(value = HttpStatus.NO_CONTENT)

public class IncorrectNameException extends RuntimeException {
}
