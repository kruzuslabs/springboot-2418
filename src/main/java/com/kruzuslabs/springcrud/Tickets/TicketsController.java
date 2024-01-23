package com.kruzuslabs.springcrud.Tickets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TicketsController {

    @Autowired
    protected final TicketsRepository tasksRepository;

    public TicketsController(TicketsRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @GetMapping("all")
    public ResponseEntity<List<TicketsEntity>> findAll() {
        List<TicketsEntity> _tasks = this.tasksRepository.findAll();

        if (_tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<TicketsEntity>>(_tasks, HttpStatus.OK);

        }
    }
}