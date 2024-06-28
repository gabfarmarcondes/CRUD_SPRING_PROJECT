package com.project.crud.model;

import com.project.crud.dto.RequestUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tab_users")
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 15)
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @NotBlank
    @Size(min = 5, max = 20)
    @Column(nullable = false, unique = true, length = 50)
    private String password;

    @NotBlank
    @Size(min = 5, max = 20)
    @Column(nullable = false, unique = true, length = 50)
    private String confirmPassword;

    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;

    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    private String confirmEmail;

    @NotBlank
    @Column(nullable = false)
    @Min(18)
    private int age;

    public User(RequestUser requestUser) {
        this.username = requestUser.username();
        this.password = requestUser.password();
        this.confirmPassword = requestUser.confirmPassword();
        this.age = requestUser.age();
        this.email = requestUser.email();
        this.confirmEmail = requestUser.confirmEmail();
    }
}
