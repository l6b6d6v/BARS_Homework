package ru.lebedevbars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.lebedevbars.entity.User;
import ru.lebedevbars.repository.UserRepos;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UserRepos userRepos;

/*    @PostMapping
    public ResponseEntity registration(@RequestBody User user) {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }*/

    @GetMapping("/users/user")
    public String getUsersPage(Model model) {
        List<User> user = userRepos.findAll();
        model.addAttribute("users", user);
        return "users_page";
    }

    @GetMapping("/users/status")
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
