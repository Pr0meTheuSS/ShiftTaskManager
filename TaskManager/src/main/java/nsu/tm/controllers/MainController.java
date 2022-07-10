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
@Api(description = "Single controller")
public class MainController {

    private TaskRepository tr;

    @Autowired
    MainController(TaskRepository tr) {
        this.tr  = tr;
    }
    @ApiOperation("Get all tasks from server")
    @GetMapping("/getalltasks")
    public ResponseEntity<String> getAllTasks() {
        StringBuilder ret = new StringBuilder("[");
        for (Task tsk: this.tr.findAll()
             ) {
            ret.append(tsk.toString());
        }
        ret.append("]");
        return ResponseEntity.ok("All Tasks:\n" + ret);
    }

    @PostMapping(value = "new/task")
    public ResponseEntity<?> addNewTask(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String tag,
            @RequestParam int priority
    ) {
        Task task = new Task(title, description, tag, priority);
        tr.save(task);
        return ResponseEntity.ok(task);
    }
}
