package com.example.demo9.task;

import com.example.api.controller.TasksApi;
import com.example.api.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskControllerApiImpl implements TasksApi {

    @Override
    public ResponseEntity<List<Task>> getAllTasks() {
        Task task = new Task();
        task.name("Send hello from Spring Boot");

        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        return ResponseEntity.ok(taskList);
    }

}
