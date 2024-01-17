package com.kruzuslabs.springcrud.Users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity, UUID> {
}
