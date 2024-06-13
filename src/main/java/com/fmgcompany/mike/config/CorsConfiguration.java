package com.fmgcompany.mike.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173", "https://mike-front-end.vercel.app/", "http://localhost:8080","https://mike-devo-front-end-jxh3.vercel.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true); // Permite cookies
    }
}
