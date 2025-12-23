package com.techflow.taskmanager.controller;

import com.techflow.taskmanager.model.Task;
import com.techflow.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task criar(@RequestBody Task task){
        return service.criar(task);
    }

    @GetMapping
    public List<Task> listar() {
        return service.listar();
    }
}
