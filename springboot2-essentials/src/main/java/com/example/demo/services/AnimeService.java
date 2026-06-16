package com.example.demo.services;

import com.example.demo.entities.Anime;
import com.example.demo.exception.BadRequestException;
import com.example.demo.mapper.AnimeMapper;
import com.example.demo.repository.AnimeRepository;
import com.example.demo.request.AnimePostRequetBody;
import com.example.demo.request.AnimePutRequetBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService{

    @Autowired
    private AnimeMapper animeMapper;

    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public List<Anime> findbyName(String name){
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrThrowBadRequestException(Long id){
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not Found"));

    }

    public Anime save(AnimePostRequetBody animePostRequetBody) {
        Anime save = animeRepository.save(animeMapper.toAnime(animePostRequetBody));
        if(true){

        }
        return save;
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequetBody animePutRequetBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequetBody.getId());
        Anime anime = animeMapper.toAnime(animePutRequetBody);
        anime.setId(savedAnime.getId());
        animeRepository.save(anime);
    }
}
