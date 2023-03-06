package com.example.gft.ToDoList.controllers;

import com.example.gft.ToDoList.constants.ToDoListConstants;
import com.example.gft.ToDoList.entities.TodoUser;
import com.example.gft.ToDoList.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(ToDoListConstants.API_PREFIX_V1)
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @PostMapping(ToDoListConstants.USER_CONTROLLER_CREATE_USER)
    public ResponseEntity<TodoUser> createUser(@RequestParam String username) throws URISyntaxException {
        log.debug("REST request to save user : {}", username);
        if (userService.checkIfUserExists(username) == true) {
            return ResponseEntity.noContent().header("Fail", "Username exists").build();
        }
        TodoUser newUser = new TodoUser();
        newUser.setUserName(username);
        TodoUser result = userService.createUser(newUser);

        return ResponseEntity.ok(newUser);
    }
}
