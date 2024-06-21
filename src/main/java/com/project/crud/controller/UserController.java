package com.project.crud.controller;

import com.project.crud.dto.RequestUser;
import com.project.crud.model.User;
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
        User newUser = new User(user);
        userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }

    // TODO: implementar os endpoints {id}
    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody @Validated RequestUser user) {
        User userUp = userRepository.getReferenceById(user.id());
        userUp.setUsername(user.username());
        userUp.setPassword(user.password());
        return ResponseEntity.ok(userRepository.save(userUp));
    }

    // TODO: implementar os endpoints {id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id,@RequestBody @Validated RequestUser user) {
        userRepository.deleteById(user.id());
        return ResponseEntity.ok().build();
    }
}
