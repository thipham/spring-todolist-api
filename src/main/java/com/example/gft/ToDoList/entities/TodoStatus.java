package com.example.gft.ToDoList.entities;

import javax.persistence.*;

@Entity
@Table(name = "todo_status")
public class TodoStatus {
    @Id
    private long id;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
