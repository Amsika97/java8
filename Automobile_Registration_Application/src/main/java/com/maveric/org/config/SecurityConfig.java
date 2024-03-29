package com.maveric.org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(authorize -> authorize.
				requestMatchers(HttpMethod.POST, "api/user/Registration" ).permitAll()
//			   .requestMatchers(HttpMethod.POST, PUBLIC_URL ).permitAll()
//				.requestMatchers(HttpMethod.GET, PUBLIC_URL).permitAll()
				.anyRequest().authenticated());
//		.exceptionHandling(ex -> ex.authenticationEntryPoint(point));
		
//		httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//		httpSecurity.authenticationProvider(authenticationProvider());
//		httpSecurity.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//		
		return httpSecurity.build();
	}

}
