package com.caiul.first.sping.app.controller;

import com.caiul.first.sping.app.domain.User;
import com.caiul.first.sping.app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("caiul");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter",defaultValue = "nenhum") String filter,@RequestBody User user) {
        return "HELLO WORLD POST! " + filter;



    }
}
