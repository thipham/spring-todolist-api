package com.example.gft.ToDoList.controllers;

import com.example.gft.ToDoList.constants.ToDoListConstants;
import com.example.gft.ToDoList.entities.TodoItem;
import com.example.gft.ToDoList.entities.TodoUser;
import com.example.gft.ToDoList.services.ItemService;
import com.example.gft.ToDoList.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(ToDoListConstants.API_PREFIX_V1)
public class ItemController {
    private final Logger log = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;
    @PostMapping(ToDoListConstants.ITEM_CONTROLLER_CREATE_ITEM)
    public ResponseEntity<TodoItem> createItem(@RequestBody TodoItem item) throws URISyntaxException {
        log.debug("REST request to create item : {}", item);
        TodoItem result = itemService.createItem(item);
        return ResponseEntity.ok(result);
    }

    @GetMapping(ToDoListConstants.ITEM_CONTROLLER_GET_LIST_ITEM_OF_USER)
    public ResponseEntity<List<TodoItem>> getListItemOfUser(@RequestParam String username) throws URISyntaxException {
        log.debug("REST request to get list item of user : {}", username);
        List<TodoItem> result = itemService.findAllItemsOfUser(username);
        return ResponseEntity.ok(result);
    }
}
