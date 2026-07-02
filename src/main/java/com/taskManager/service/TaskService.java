package com.taskManager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taskManager.entity.Task;
import com.taskManager.repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
public class TaskService {

    private TaskRepository taskRepository;
    
    TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    @Transactional
    public Task addTask(Task task){
        return taskRepository.save(task);
    }
    
}
