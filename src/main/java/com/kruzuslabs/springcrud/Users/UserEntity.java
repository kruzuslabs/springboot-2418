package com.kruzuslabs.springcrud.Users;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users", schema = "public", catalog = "skoozle")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
}
