package com.example.demo9.task;

import com.example.api.controller.TasksApi;
import com.example.api.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskControllerApiImpl implements TasksApi {

    @Override
    public ResponseEntity<List<Task>> getAllTasks() {
        Greeting greeting = new Greeting();
        greeting.message("Hello from Spring Boot");
        return ResponseEntity.ok(greeting);
    }

}
