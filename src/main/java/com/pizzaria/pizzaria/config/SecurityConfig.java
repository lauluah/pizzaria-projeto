package com.pizzaria.pizzaria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .httpBasic(Customizer.withDefaults())
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(req -> {
                    req.requestMatchers(HttpMethod.POST, "/client")
                            .permitAll();
                    req.requestMatchers(HttpMethod.GET, "/client/**")
                            .permitAll();
                    req.requestMatchers(HttpMethod.DELETE, "/client/**")
                            .permitAll();

                    req.requestMatchers(new AntPathRequestMatcher("/h2/**"))
                            .permitAll();

                    try {
                        http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
                    } catch (Exception e) {
                        throw new RuntimeException("Frame options configuration not supported", e);
                    }
                    req.requestMatchers(new AntPathRequestMatcher("/favicon.ico"))
                            .permitAll();

                }).build();
    }
}