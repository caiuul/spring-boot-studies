package com.caiul.first.sping.app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {

        return "Hello World!" + name;
    }

}
