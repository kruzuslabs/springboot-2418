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
@Table(name = "tasks", schema = "public", catalog = "skoozle")
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + (completed ? 1231 : 1237);
        result = prime * result + severity;
        result = prime * result + ((authUuid == null) ? 0 : authUuid.hashCode());
        result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TaskEntity other = (TaskEntity) obj;
        if (id != other.id)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        if (completed != other.completed)
            return false;
        if (severity != other.severity)
            return false;
        if (authUuid == null) {
            if (other.authUuid != null)
                return false;
        } else if (!authUuid.equals(other.authUuid))
            return false;
        if (created_at == null) {
            if (other.created_at != null)
                return false;
        } else if (!created_at.equals(other.created_at))
            return false;
        return true;
    }

}
