package com.caiul.codingChallenge.controllers;

import com.caiul.codingChallenge.entities.Carro;
import com.caiul.codingChallenge.repositories.CarroRepository;
import com.caiul.codingChallenge.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/carros" )
public class CarroController {

    @Autowired
    private CarroService carroService;


    @PostMapping()
    public Carro insert(@RequestBody Carro carro){
        return carroService.criar(carro);

    }
}
