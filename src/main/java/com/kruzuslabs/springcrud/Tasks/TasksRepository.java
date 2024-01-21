package com.kruzuslabs.springcrud.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<TaskEntity, Integer> {

}
