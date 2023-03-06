package com.example.gft.ToDoList.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todo_user")
public class TodoUser {
    @Id
    private long id;
    private String userName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
