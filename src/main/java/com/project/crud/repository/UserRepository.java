package com.project.crud.repository;

import com.project.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsename(String usename);
    Optional<User> findById(Long id);
}
