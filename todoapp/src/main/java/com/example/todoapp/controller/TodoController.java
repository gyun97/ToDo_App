package com.example.todoapp.controller;

import com.example.todoapp.domain.ToDo;
import com.example.todoapp.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor // spring이 실행되면서 자동으로 Controller에 todoRepository 할당

public class TodoController {
    private final ToDoRepository todoRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<ToDo> todos = todoRepository.findAll(); // todoRepository에서 모두 가져오기
        model.addAttribute("todos", todos); // todos라는 이름으로 읽어온 모든 목록 담기
        return "todos";
    }

    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todo) {
        //데이터베이스에 저장하면 된다
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        todoRepository.save(toDo);

        return "redirect:/"; // "/"로 다시 되돌아오기
    }
}
