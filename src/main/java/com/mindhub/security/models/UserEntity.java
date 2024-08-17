package com.mindhub.security.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name, lastname, password;

    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private String email;

    private RolEnum rol = RolEnum.USER;

    public UserEntity() {
    }

    public UserEntity(String name, String lastname, String password, String userName, String email) {
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.userName = userName;
        this.email = email;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
