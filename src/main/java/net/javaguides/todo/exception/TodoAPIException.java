package net.javaguides.todo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TodoAPIException extends RuntimeException {

    private final HttpStatus status;
    private final String message;

    public TodoAPIException(HttpStatus status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
}