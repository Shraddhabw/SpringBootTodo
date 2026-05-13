package UserManagement.todo_management.service;

import UserManagement.todo_management.dto.TodoDto;

public interface TodoService {

    TodoDto AddTodo(TodoDto todoDto);

    TodoDto GetTodo(Long id);
}
