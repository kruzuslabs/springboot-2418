package com.kruzuslabs.springcrud.Tickets;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketsRepository extends JpaRepository<TicketsEntity, Integer> {
    List<TicketsEntity> findByContentContaining(String query);
}
