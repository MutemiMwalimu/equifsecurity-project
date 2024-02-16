package com.springsecurity.equifarmsecurity.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String  firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}