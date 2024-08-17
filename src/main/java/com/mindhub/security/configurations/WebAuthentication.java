//package com.mindhub.security.configurations;
//
//import com.mindhub.security.models.UserEntity;
//import com.mindhub.security.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public void init(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService( username -> {
//
//            UserEntity user = userRepository.findByEmail(username).orElseThrow( () -> new UsernameNotFoundException("no te conoce"));
//
//            return new User( user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList("USER"));
//
//        } );
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
