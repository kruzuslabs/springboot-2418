package com.kruzuslabs.springcrud.Tickets;

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
@Table(name = "tickets")
public class TicketsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

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
    @Column(name = "created_at", nullable = true)
    private Date created_at;

    @Basic
    @Column(name = "due_date", nullable = true)
    private Date due_date;

    public TicketsEntity(long id, String title, String content, boolean completed, short severity, Date created_at,
            Date due_date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.completed = completed;
        this.severity = severity;
        this.created_at = created_at;
        this.due_date = due_date;
    }

    public TicketsEntity() {

    }

    public long getId() {
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

}
