package com.example.gft.ToDoList.repositories;

import com.example.gft.ToDoList.entities.TodoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<TodoUser, Long> {
    List<TodoUser> findAll();

    List<TodoUser> findByUserName(String username);
}
