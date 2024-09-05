package com.Sammy.ToDoThymeleaf.controllers;

import com.Sammy.ToDoThymeleaf.Models.ToDoListItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ToDoController {

    List<ToDoListItem> items = new ArrayList<>(
            List.of(
                    new ToDoListItem(1, "Buy Food", "Go to PinNPay to buy food", "Not Done"),
                    new ToDoListItem(2, "Correct Code", "In the Spring Boot Project", "Done"),
                    new ToDoListItem(3, "Call Peter", "Call him at 7pm", "Not Done")
            )
    );

    @GetMapping("/")
    public String getToDoList(Model model){
        model.addAttribute("items", items);
        return "todolist";
    }
}
