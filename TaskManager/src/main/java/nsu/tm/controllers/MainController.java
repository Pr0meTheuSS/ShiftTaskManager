package nsu.tm.controllers;

import nsu.tm.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
//@Api(description = "Single controller")
public class MainController {

    private TaskRepository tr;

    @Autowired
    MainController(TaskRepository tr) {
        this.tr  = tr;
    }
//    @ApiOperation("Get all tasks from server")
    @GetMapping("/get")
    public String home() {
        return "Hello " + this.tr.findAll().get(0).getTitle().toString();
    }
}
