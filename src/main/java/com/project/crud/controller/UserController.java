package com.project.crud.controller;

import com.project.crud.dto.RequestUser;
import com.project.crud.model.User;
import com.project.crud.repository.UserRepository;
import com.project.crud.services.crud.UserServicesCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;


@RestController
@RequestMapping("/users")
public class UserController {

}
