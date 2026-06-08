package com.example.demo.services;

import com.example.demo.entities.Anime;
import com.example.demo.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.spi.ToolProvider.findFirst;

@Service

public class AnimeService{
    private static List<Anime> animes;
    static{
        animes = new ArrayList<>(List.of(new Anime(1L ,"Boku no hero"), new Anime(2L ,"Berserk")));
    }
    public List<Anime> listAll(){
        return animes;
    }

    public Anime findById(Long id){
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));

    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 1000));
        animes.add(anime);
        return anime;
    }
}
