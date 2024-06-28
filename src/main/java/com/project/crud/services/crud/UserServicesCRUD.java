package com.project.crud.services.crud;

import com.project.crud.model.User;
import com.project.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServicesCRUD {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id){
        User userToUpdate = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not Found"));
        return userRepository.save(userToUpdate);
    }

    public void deleteUser(Long id) {
        User userToDelete = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not Found"));
        userRepository.delete(userToDelete);
    }

}
