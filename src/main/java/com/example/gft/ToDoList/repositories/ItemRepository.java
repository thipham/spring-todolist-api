package com.example.gft.ToDoList.repositories;

import com.example.gft.ToDoList.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<TodoItem, Long> {
    List<TodoItem> findAll();
}
