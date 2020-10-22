package org.smartworld.alecs535.todolist.exceptions;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * Класс ошибки некорректного обращения в адресной строке.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
}
