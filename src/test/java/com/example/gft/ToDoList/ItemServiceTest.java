package com.example.gft.ToDoList;

import com.example.gft.ToDoList.entities.TodoItem;
import com.example.gft.ToDoList.services.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ItemServiceTest {
    @Autowired
    private ItemService itemService;

    @Test
    void test_createItem() {
        List<TodoItem> oldList = itemService.findAllItems();
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
        List<TodoItem> newList = itemService.findAllItems();
        assertTrue(newList.size() - oldList.size() == 1);
    }

    @Test
    void test_getListItemOfUser() {
        String username = "Thi";
        List<TodoItem> list = itemService.findAllItemsOfUser(username);

        assertNotNull(list);
    }


}
