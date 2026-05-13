package UserManagement.todo_management.service.impl;

import UserManagement.todo_management.dto.TodoDto;
import UserManagement.todo_management.entity.Todo;
import UserManagement.todo_management.repository.TodoRepository;
import UserManagement.todo_management.service.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    private ModelMapper modelMapper;

    @Override
    public TodoDto AddTodo(TodoDto todoDto) {


        //convert todo dto into todo jpa entity

        Todo todo = modelMapper.map(todoDto, Todo.class);

//        Todo todo = new Todo();
//        todo.setTitle(todoDto.getTitle());
//        todo.setDescription(todoDto.getDescription());
//        todo.setCompleted(todoDto.isCompleted());



        Todo todoSaved = todoRepository.save(todo);


        TodoDto savedTodoDto = modelMapper.map(todoSaved, TodoDto.class);


//        TodoDto savedTodoDto = new TodoDto();
//        savedTodoDto.setId(todoSaved.getId());
//        savedTodoDto.setTitle(todoSaved.getTitle());
//        savedTodoDto.setDescription(todoSaved.getDescription());
//        savedTodoDto.setCompleted(todoSaved.isCompleted());
        return savedTodoDto;

    }

    @Override
    public TodoDto GetTodo(Long id) {

        Todo getTodo = todoRepository.findById(id).get();
        TodoDto getTodoDto = modelMapper.map(getTodo,TodoDto.class);
        return getTodoDto;
    }
}
