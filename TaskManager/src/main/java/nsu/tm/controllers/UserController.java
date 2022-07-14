package nsu.tm.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nsu.tm.model.User;
import nsu.tm.repo.TaskRepository;
import nsu.tm.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    @Autowired
    UserController(UserRepository userRepository) {
        this.userRepository  = userRepository;
    }

    @ApiOperation("Get all users from server")
    @GetMapping("/getall")
    public ResponseEntity<?> getAllTasks() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping(value = "/new")
    public ResponseEntity<?> addNewTask(
            @RequestBody
                    User user
    ) {
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }
}
