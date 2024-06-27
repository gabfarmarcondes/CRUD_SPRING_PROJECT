package com.project.crud.services;

import com.project.crud.model.User;
import com.project.crud.repository.UserRepository;
import com.project.crud.services.userServicesImpl.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices implements UserServicesImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> ageOfMajority(int age) {
        return Optional.empty();
    }

    @Override
    public Optional<User> sameEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<User> samePassword(String password) {
        return Optional.empty();
    }

    @Override
    public Optional<User> userExists(Long id) {
        return Optional.empty();
    }
}
