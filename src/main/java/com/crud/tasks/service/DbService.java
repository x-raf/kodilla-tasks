package com.crud.tasks.service;

import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(final Long id) {
        return repository.findOne(id);
    }

    public Task saveTask(final Task task){
        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.delete(id);
    }
}
