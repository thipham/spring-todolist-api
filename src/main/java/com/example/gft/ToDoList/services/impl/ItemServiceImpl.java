package com.example.gft.ToDoList.services.impl;

import com.example.gft.ToDoList.entities.TodoItem;
import com.example.gft.ToDoList.repositories.ItemRepository;
import com.example.gft.ToDoList.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepo;
    @Override
    public TodoItem createItem(TodoItem item) {
        return itemRepo.save(item);
    }

    @Override
    public List<TodoItem> findAllItems() {
        return itemRepo.findAll();
    }

    @Override
    public List<TodoItem> findAllItemsOfUser(String username) {
        return itemRepo.findAllByUserName(username);
    }
}
