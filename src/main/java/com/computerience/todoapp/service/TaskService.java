package com.computerience.todoapp.service;

import com.computerience.todoapp.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {

    public List<Task> getAllTasks();

    public void addTask(Task task);
}
