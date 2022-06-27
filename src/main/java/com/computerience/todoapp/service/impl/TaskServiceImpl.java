package com.computerience.todoapp.service.impl;

import com.computerience.todoapp.entity.Task;
import com.computerience.todoapp.repository.TaskRepository;
import com.computerience.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
