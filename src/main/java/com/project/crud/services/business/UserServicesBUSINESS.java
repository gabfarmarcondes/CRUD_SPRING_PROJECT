package com.project.crud.services.business;

import com.project.crud.model.User;
import com.project.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesBUSINESS {

    @Autowired
    private UserRepository userRepository;

    public void checkPasswordMatch(User user) {
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new IllegalArgumentException("Passwords don't match");
        }
    }

    public void checkEmailMatch(User user) {
        if (!user.getEmail().equals(user.getConfirmEmail())) {
            throw new IllegalArgumentException("Emails don't match");
        }
    }

    public void checkAge(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }
}
