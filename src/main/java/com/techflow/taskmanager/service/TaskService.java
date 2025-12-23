package com.techflow.taskmanager.service;

import com.techflow.taskmanager.model.Task;
import com.techflow.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task criar(Task task) {
        return repository.save(task);
    }

    public List<Task> listar() {
        return repository.findAll();
    }
}
