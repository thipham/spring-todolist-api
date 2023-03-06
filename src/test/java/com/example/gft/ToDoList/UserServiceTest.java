package com.example.gft.ToDoList;

import com.example.gft.ToDoList.entities.TodoUser;
import com.example.gft.ToDoList.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void test_getAllUser() {
        List<TodoUser> listUser = userService.findAllUsers();
        assertTrue(listUser.size() > 0);
    }

    @Test
    void test_createUser() {
        List<TodoUser> oldList = userService.findAllUsers();
        TodoUser user = new TodoUser();
        user.setUser_name("Thi");
        userService.createUser(user);
        List<TodoUser> newList = userService.findAllUsers();
        assertTrue(oldList.size() - newList.size() == 1);
    }
}
