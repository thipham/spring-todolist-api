package com.example.gft.ToDoList.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todo_user")
public class TodoUser {
    @Id
    private long id;
    private String user_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
