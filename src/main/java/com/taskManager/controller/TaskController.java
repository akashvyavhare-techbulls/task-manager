package com.taskManager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.dto.ResponseDto;
import com.taskManager.entity.Task;
import com.taskManager.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;
    TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping
    public ResponseDto<List<Task>> getAllTask(){
        return ResponseDto.<List<Task>>builder().data(taskService.getAllTask()).build();
    }
    

    @PostMapping
    public ResponseDto<Task> addTask(@RequestBody Task newTask){
       Task task = taskService.addTask(newTask);
       return ResponseDto.<Task>builder().data(task).build();
    }

}
