package com.project.crud.controller;

import com.project.crud.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    private ArrayList<User> users = new ArrayList<>();

    @GetMapping("/add")
    public ResponseEntity addUser(User user) {
        users.add(user);
        return ResponseEntity.ok(user);
    }
}
