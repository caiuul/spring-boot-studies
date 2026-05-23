package com.caiul.codingChallenge.services;

import com.caiul.codingChallenge.entities.Carro;
import com.caiul.codingChallenge.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;


    int anoMinimo = LocalDate.now().getYear() - 30;

    public Carro criar(Carro carro){
        if (carro.getAno() < anoMinimo ){
            throw new RuntimeException("Veículo muito antigo para a frota parceira.");
        }

        Optional<Carro> carroExistente = carroRepository.findByModeloAndMarca(carro.getModelo(),  carro.getMarca());
        if (carroExistente.isPresent()){
            throw new RuntimeException("Este veículo já está cadastrado na frota.");
        }

        return carroRepository.save(carro);
    }

    public void excluir(Long id){

    }


}
