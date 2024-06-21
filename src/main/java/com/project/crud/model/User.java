package com.project.crud.model;

import com.project.crud.dto.RequestUser;
import jakarta.persistence.*;
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

    private String username;
    private String password;

    public User(RequestUser requestUser) {
        this.username = requestUser.username();
        this.password = requestUser.password();
    }
}
