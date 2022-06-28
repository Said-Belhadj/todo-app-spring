package com.computerience.todoapp.service.impl;

import com.computerience.todoapp.entity.Task;
import com.computerience.todoapp.repository.TaskRepository;
import com.computerience.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void addTask(Task task){
        taskRepository.save(task);
    }
}
