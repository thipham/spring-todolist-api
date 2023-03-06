package com.example.gft.ToDoList.services;

import com.example.gft.ToDoList.entities.TodoUser;

import java.util.List;

public interface UserService {
    public List<TodoUser> findAllUsers();
}
