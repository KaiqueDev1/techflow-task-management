package com.techflow.taskmanager.repository;

import com.techflow.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
