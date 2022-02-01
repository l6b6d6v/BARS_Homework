package ru.lebedevbars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.lebedevbars.entity.Dogovor;
import ru.lebedevbars.repository.DogovorRepo;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private DogovorRepo dogovorRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody Dogovor user) {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<Dogovor> dogovors = dogovorRepo.findAll();
        model.addAttribute("dogovors", dogovors);
        return "users_page";
    }

    @GetMapping("/")
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
