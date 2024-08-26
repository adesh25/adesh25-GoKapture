package com.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.demo.model.Task;
import com.demo.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findByUserId(Long userId) {
        return taskRepository.findByUserId(userId);
    }

    public List<Task> findByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    public List<Task> findByPriority(String priority) {
        return taskRepository.findByPriority(priority);
    }

    public List<Task> findByDueDate(String dueDate) {
        return taskRepository.findByDueDate(dueDate);
    }

    public Optional<Task> findById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    public void delete(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
