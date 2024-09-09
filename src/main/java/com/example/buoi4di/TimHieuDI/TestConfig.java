package com.example.buoi4di.TimHieuDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public Meo craeteMeo() {
        return new Meo();
    }
}
