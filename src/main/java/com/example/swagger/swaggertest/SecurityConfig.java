//package com.example.swagger.swaggertest;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf().disable() // Disable CSRF for simplicity (not recommended for production without proper handling)
//            .authorizeHttpRequests()
//            .requestMatchers("/api/auth/**").permitAll() // Allow authentication endpoints
//            .anyRequest().authenticated() // Secure all other endpoints
//            .and()
//            .httpBasic(); // Use Basic Authentication for simplicity (you can use JWT or OAuth2 instead)
//
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//}
