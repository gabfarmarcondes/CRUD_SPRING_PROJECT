package com.project.crud.dto;

import jakarta.validation.Valid;

@Valid
public record RequestUser(
        Long id,
        String username,
        String password,
        String confirmPassword,
        String email,
        String confirmEmail,
        int age)
{ }
