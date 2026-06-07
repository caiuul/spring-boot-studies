package com.example.demo.services;

import com.example.demo.entities.Anime;
import com.example.demo.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AnimeService{

    public List<Anime> listAll(){
        return List.of(new Anime(1 ,"Boku no hero"), new Anime(2 ,"Berserk"));
    }
}
