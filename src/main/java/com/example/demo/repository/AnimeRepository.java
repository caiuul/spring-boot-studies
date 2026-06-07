package com.example.demo.repository;

import com.example.demo.entities.Anime;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository {
    List<Anime> listAll();
}
