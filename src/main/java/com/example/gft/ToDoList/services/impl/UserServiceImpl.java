package com.example.gft.ToDoList.services.impl;

import com.example.gft.ToDoList.entities.TodoUser;
import com.example.gft.ToDoList.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<TodoUser> findAllUsers() {
        return null;
    }
}
