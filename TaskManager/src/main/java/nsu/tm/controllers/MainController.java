package nsu.tm.controllers;

import nsu.tm.model.Task;
import nsu.tm.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class MainController {

    private TaskRepository taskRepo;
    @Autowired
    public MainController(TaskRepository taskRepository) {
        this.taskRepo = taskRepository;
    }

    @GetMapping("/getalltasks")
    public String home() {
        return this.taskRepo.findAll().toString();
    }
}
