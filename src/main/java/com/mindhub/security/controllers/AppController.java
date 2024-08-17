package com.mindhub.security.controllers;

import com.mindhub.security.models.UserEntity;
import com.mindhub.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AppController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public UserEntity getUser(Authentication authentication){
        return userRepository.findByUserName(authentication.getName()).orElseThrow( () -> new UsernameNotFoundException("No encontre nada"));
    }
}
