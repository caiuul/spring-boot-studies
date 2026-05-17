package com.caiul.first.sping.app.configuration;


import com.caiul.first.sping.app.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World!";
    }
}


