package UserManagement.todo_management.controller;


import UserManagement.todo_management.dto.TodoDto;
import UserManagement.todo_management.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class todoController {

    private TodoService todoService;
    //build addTodo rest api
    @PostMapping

    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto)
    {
        TodoDto todoDto1 = todoService.AddTodo(todoDto);

        return new ResponseEntity<>(todoDto1, HttpStatus.CREATED);
    }

    //build get Todo rest api
    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") Long id)
    {
        TodoDto todoDto1 = todoService.GetTodo(id);

        return new ResponseEntity<>(todoDto1, HttpStatus.OK);
    }
}
