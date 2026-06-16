package com.example.demo.mapper;

import com.example.demo.entities.Anime;
import com.example.demo.request.AnimePostRequetBody;
import com.example.demo.request.AnimePutRequetBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public abstract Anime toAnime(AnimePostRequetBody animePostRequetBody);
    public abstract Anime toAnime(AnimePutRequetBody animePutRequetBody);
}
