package com.kruzuslabs.springcrud.Tickets;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
public class TicketsController {

    @Autowired
    protected final TicketsRepository tasksRepository;

    public TicketsController(TicketsRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    // TEST: DO NOT USE FOR PROD...
    // TESTING AREA
    @GetMapping("all")
    public ResponseEntity<?> findAll() {
        List<TicketsEntity> _tasks = this.tasksRepository.findAll();

        if (_tasks.isEmpty()) {
            return new ResponseEntity<>(Map.of(
                    "msg", "tasks not found",
                    "code", HttpStatus.NOT_FOUND),
                    HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<TicketsEntity>>(_tasks, HttpStatus.OK);
        }
    }

    // TODO: implement this
    @GetMapping("/search/{query}")
    public ResponseEntity<List<TicketsEntity>> search(@PathVariable String query) {

        List<TicketsEntity> foundList = this.tasksRepository.findByContentContaining(query);

        if (foundList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<TicketsEntity>>(foundList, HttpStatus.FOUND);
        }
    }

    // TODO: Change Mapping
    @GetMapping()
    public ResponseEntity<?> createTicket() {
        return new ResponseEntity<>("Create ticket", HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<?> editTicket(@PathVariable int id) {
        return new ResponseEntity<>(Map.of("Edit TicketID", id), HttpStatus.OK);
    }

    // api/ticket/id
    // gets ticket by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getEditByID(@PathVariable int id) {
        return new ResponseEntity<>(Map.of("TicketID", id), HttpStatus.OK);
    }

}
