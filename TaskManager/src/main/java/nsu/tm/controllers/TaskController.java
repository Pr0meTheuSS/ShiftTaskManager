package nsu.tm.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Parameter;
import nsu.tm.model.Task;
import nsu.tm.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;
    @Autowired
    TaskController(TaskRepository tr) {
        this.taskRepository  = tr;
    }

    @ApiOperation("Get all tasks from server")
    @GetMapping("/getall")
    public ResponseEntity<?> getAllTasks() {
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @PostMapping(value = "/new")
    public ResponseEntity<?> addNewTask(
            @RequestBody
                Task task
    ) {
        taskRepository.save(task);
        return ResponseEntity.ok(task);
    }
}
