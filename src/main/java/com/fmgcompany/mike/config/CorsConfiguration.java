package com.fmgcompany.mike.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://mike-devo-front-end-jxh3.vercel.app/","https://mike-front-end.vercel.app/","http://localhost:5173","http://localhost:8100","http://localhost:8080")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true); // Permite cookies
    }
}
