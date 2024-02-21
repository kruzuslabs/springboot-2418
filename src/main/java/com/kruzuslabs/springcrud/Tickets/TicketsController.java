package com.kruzuslabs.springcrud.Tickets;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicketsController {

    @Autowired
    protected final TicketsRepository ticketsRepository;

    public TicketsController(TicketsRepository tasksRepository) {
        this.ticketsRepository = tasksRepository;
    }

    // TEST: DO NOT USE FOR PROD...
    // TESTING AREA
    @GetMapping("all")
    public ResponseEntity<List<TicketsEntity>> findAll() {
        List<TicketsEntity> tasks = ticketsRepository.findAll();

        HttpStatus status = tasks.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).body(tasks.isEmpty() ? null : tasks);
    }

    @SuppressWarnings("null")
    @PostMapping("/new")
    public TicketsEntity createTicket(@RequestBody TicketsEntity ticketDTO) {
        return this.ticketsRepository.save(ticketDTO);
    }

}
