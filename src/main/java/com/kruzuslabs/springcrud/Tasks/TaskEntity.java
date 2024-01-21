package com.kruzuslabs.springcrud.Tasks;

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
@Table(name = "tasks")
public class TaskEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "title", nullable = true)
    private String title;

    @Basic
    @Column(name = "content", nullable = true)
    private String content;

    @Basic
    @Column(name = "completed", nullable = true)
    private boolean completed;

    @Basic
    @Column(name = "severity", nullable = true)
    private short severity;

    @Basic
    @Column(name = "author_id", nullable = true)
    private UUID authUuid;

    @Basic
    @Column(name = "created_at", nullable = true)
    private Date created_at;

    public TaskEntity() {

    }

    public TaskEntity(int id, String title, String content, boolean completed, short severity, UUID authUuid,
            Date created_at) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.completed = completed;
        this.severity = severity;
        this.authUuid = authUuid;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public short getSeverity() {
        return severity;
    }

    public void setSeverity(short severity) {
        this.severity = severity;
    }

    public UUID getAuthUuid() {
        return authUuid;
    }

    public void setAuthUuid(UUID authUuid) {
        this.authUuid = authUuid;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
