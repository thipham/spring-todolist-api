package com.example.gft.ToDoList;

import com.example.gft.ToDoList.entities.TodoItem;
import com.example.gft.ToDoList.services.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ItemServiceTest {
    @Autowired
    private ItemService itemService;

    @Test
    void test_createItem() {
        //List<TodoItem> oldList = itemService.findAllItems();
        Date dt = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormatter.format(dt);
        TodoItem item = new TodoItem();
        item.setTitle("To do Item 1");
        item.setDescription("To do Item 1");
        item.setCreatedDate(currentTime);
        item.setModifiedDate(currentTime);
        item.setDeadline(currentTime);
        item.setStatusId(1);
        item.setUserId(1);
        itemService.createItem(item);
        //List<TodoItem> newList = itemService.findAllItems();
        //assertTrue(oldList.size() - newList.size() == 1);
    }
}
