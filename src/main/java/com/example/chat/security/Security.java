package com.example.chat.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
//        httpSecurity.authorizeHttpRequests((authorizationManagerRequestMatcherRegistry) -> authorizationManagerRequestMatcherRegistry
//                .requestMatchers("/admin").hasRole("ADMIN")
//                .requestMatchers("Страница регистрации").permitAll()
//                .anyRequest().denyAll();
//
//    }
}
