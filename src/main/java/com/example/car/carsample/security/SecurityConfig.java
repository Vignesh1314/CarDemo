package com.example.car.carsample.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager configUserName(PasswordEncoder passwordEncoder) {
		

        UserDetails user = User.withUsername("vignesh")
        		.password(passwordEncoder.encode("password"))
        		.roles("User").build();
        
      //  UserDetails admin = User.withUsername(")
        
		
		return new InMemoryUserDetailsManager(user);
		
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return encoder;
    }
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
	        
	        return http.build();
	    } 

}
