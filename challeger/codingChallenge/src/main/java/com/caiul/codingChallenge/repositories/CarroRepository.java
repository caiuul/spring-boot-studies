package com.caiul.codingChallenge.repositories;

import com.caiul.codingChallenge.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    Optional<Carro> findByModeloAndMarca(String modelo, String marca);
}
