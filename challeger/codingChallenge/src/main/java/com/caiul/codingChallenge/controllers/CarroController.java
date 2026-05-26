package com.caiul.codingChallenge.controllers;

import com.caiul.codingChallenge.entities.Carro;
import com.caiul.codingChallenge.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;


    @PostMapping
    public ResponseEntity<Carro> insert(@RequestBody Carro carro) {
        Carro carroSalvo = carroService.create(carro);
        return ResponseEntity.status(201).body(carroSalvo);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        carroService.excluir(id);
        return ResponseEntity.noContent().build();
    }


}
