package se.distansakademin.simple_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.distansakademin.simple_spring_app.models.Task;
import se.distansakademin.simple_spring_app.repositories.TaskRepository;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;



    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", (List<Task>) taskRepository.findAll());
        return "tasks"; // Namnet på Thymeleaf-vymallen som ska renderas (ex. tasks.html)
    }
}