package com.kruzuslabs.springcrud.Tickets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<TicketsEntity, Integer> {

}
