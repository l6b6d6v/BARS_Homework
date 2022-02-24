package ru.lebedevbars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SigninController {
    @GetMapping("/signin")
    public String getSigninPage() {
        return "signin_page";
    }
}