package com.kruzuslabs.springcrud.Users;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Basic
    @Column(name = "username", nullable = false)
    String userName;

    @Basic
    @Column(name = "hashed_password", nullable = false)
    String hashedPassword;

    @Basic
    @Column(name = "total_posts", nullable = false)
    int totalPosts;

    @Basic
    @Column(name = "created_at", nullable = false)
    Date createdAt;

    @Basic
    @Column(name = "updated_at", nullable = false)
    Date updatedAt;

    public UserEntity() {
    }

    public UserEntity(UUID id, String userName, String hashedPassword, int totalPosts, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userName = userName;
        this.hashedPassword = hashedPassword;
        this.totalPosts = totalPosts;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
