package ru.lebedevbars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.lebedevbars.entity.User;
import ru.lebedevbars.repository.UserRepos;

@Controller
public class SignupController {

    @Autowired
    private UserRepos userRepos;


    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup_page";
    }

    @PostMapping("/signup")
    public String signupUser(User user) {
        userRepos.save(user);
        return "redirect:/signup_page";
    }
}

