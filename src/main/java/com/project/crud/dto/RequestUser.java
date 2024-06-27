package com.project.crud.dto;

import org.springframework.validation.annotation.Validated;

@Validated
public record RequestUser(Long id, String username,  String password, String email, int age) {
}
