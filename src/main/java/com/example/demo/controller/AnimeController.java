package com.example.demo.controller;

import com.example.demo.entities.Anime;
import com.example.demo.services.AnimeService;
import com.example.demo.util.DateUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor

public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }

}
