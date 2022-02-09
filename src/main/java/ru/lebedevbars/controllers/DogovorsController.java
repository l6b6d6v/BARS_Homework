package ru.lebedevbars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.lebedevbars.entity.Dogovor;
import ru.lebedevbars.repository.DogovorRepos;

import java.util.List;

@Controller
public class DogovorsController {

    @Autowired
    private DogovorRepos dogovorRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody Dogovor dogovor) {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/dogovors/dog")
    public String getUsersPage(Model model) {
        List<Dogovor> dogovors = dogovorRepo.findAll();
        model.addAttribute("dogovors", dogovors);
        return "dogovors_page";
    }

    @GetMapping("/dogovors/status")
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Сервер работет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
