package com.mindhub.security;

import com.mindhub.security.models.UserEntity;
import com.mindhub.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public CommandLineRunner initData(UserRepository userRepository){
		return args -> {
			UserEntity user = new UserEntity("Melba", "Morel", passwordEncoder.encode("123456"),"MelbaMorel", "melba@mindhub.com");
			userRepository.save(user);
		};
	}
}
