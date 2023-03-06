package com.example.gft.ToDoList.services;

import com.example.gft.ToDoList.entities.TodoItem;

import java.util.List;

public interface ItemService {
    public List<TodoItem> findAll();
}
