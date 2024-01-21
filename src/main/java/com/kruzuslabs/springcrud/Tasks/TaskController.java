package com.kruzuslabs.springcrud.Tasks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    protected final TasksRepository tasksRepository;

    public TaskController(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @GetMapping("all")
    public ResponseEntity<List<TaskEntity>> findAll() {
        List<TaskEntity> tasks = this.tasksRepository.findAll();

        return new ResponseEntity<List<TaskEntity>>(tasks, HttpStatus.OK);

    }
}
