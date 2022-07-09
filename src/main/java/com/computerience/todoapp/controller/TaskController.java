package com.computerience.todoapp.controller;

import com.computerience.todoapp.entity.Task;
import com.computerience.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get/all/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }
}
