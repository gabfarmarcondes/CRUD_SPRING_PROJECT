package com.project.crud.controller;

import com.project.crud.dto.RequestUser;
import com.project.crud.model.User;
import com.project.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/find")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userRepository.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody @Validated RequestUser user) {
        User newUser = new User(user);
        userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody @Validated RequestUser user) {
        User userUp = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
        userUp.setUsername(user.username());
        userUp.setPassword(user.password());
        return ResponseEntity.ok(userRepository.save(userUp));

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
