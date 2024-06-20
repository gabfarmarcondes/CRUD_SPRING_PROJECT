package com.project.crud.controller;

import com.project.crud.dto.RequestUser;
import com.project.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/find")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody @Validated RequestUser user) {
        System.out.println(user);
        return ResponseEntity.ok().build();
    }
}
