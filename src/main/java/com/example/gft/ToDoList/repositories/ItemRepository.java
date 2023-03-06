package com.example.gft.ToDoList.repositories;

import com.example.gft.ToDoList.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepository extends JpaRepository<TodoItem, Long> {
    List<TodoItem> findAll();
    @Query("SELECT i FROM TodoItem i JOIN TodoUser u ON i.userId = u.id WHERE u.userName = ?1")
    List<TodoItem> findAllByUserName(String username);
}
