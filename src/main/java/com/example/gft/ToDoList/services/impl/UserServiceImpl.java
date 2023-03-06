package com.example.gft.ToDoList.services.impl;

import com.example.gft.ToDoList.entities.TodoUser;
import com.example.gft.ToDoList.repositories.UserRepository;
import com.example.gft.ToDoList.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<TodoUser> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public TodoUser createUser(TodoUser user) {
        return userRepo.save(user);
    }
}
