package com.project.crud.services.userServicesImpl;

import com.project.crud.model.User;

import java.util.Optional;

public interface UserServicesImpl {

    Optional<User> ageOfMajority(int age);
    Optional<User> sameEmail(String email);
    Optional<User> samePassword(String password);
    Optional<User> userExists(Long id);
}
