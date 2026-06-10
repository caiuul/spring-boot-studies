package com.example.demo.services;

import com.example.demo.entities.Anime;
import com.example.demo.repository.AnimeRepository;
import com.example.demo.request.AnimePostRequetBody;
import com.example.demo.request.AnimePutRequetBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService{

    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findByIdOrThrowBadRequestException(Long id){
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));

    }

    public Anime save(AnimePostRequetBody animePostRequetBody) {
        return animeRepository.save(Anime.builder().name(animePostRequetBody.getName()).build());
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequetBody animePutRequetBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequetBody.getId());
        Anime anime = Anime.builder()
                .id(savedAnime.getId())
                .name(animePutRequetBody.getName())
                .build();

        animeRepository.save(anime);
    }
}
