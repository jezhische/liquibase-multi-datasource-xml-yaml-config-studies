package ex.jezh.liquibasestudies.controller;

import ex.jezh.liquibasestudies.model.User;
import ex.jezh.liquibasestudies.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/all")
    public List<User> allUsers() {
        return userService.findAll();
    }
}
