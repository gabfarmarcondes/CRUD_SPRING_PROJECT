package com.project.crud.model;

import com.project.crud.dto.RequestUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
@Table(name = "tab_users")
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 50)
    private String password;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    public User(RequestUser requestUser) {
        this.username = requestUser.username();
        this.password = requestUser.password();
    }
}
