package com.javagists.jerseyfilms.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.stereotype.Component;

import com.javagists.jerseyfilms.model.Film;
import com.javagists.jerseyfilms.service.FilmService;
/**
 * 
 * @author javagists.com
 *
 */
@Component
@WebEndpoint(id = "genre")
public class GenreDistribution {

    @Autowired
    FilmService fs;

    @ReadOperation
    public ConcurrentMap<String, Integer> getGenreDistribution() {
        ConcurrentMap<String, Integer> gd = new ConcurrentHashMap<>();
        for (Film f : this.fs.getAllFilms()) {
            String key = f.getGenre().toString();
            gd.put(key, gd.getOrDefault(key, 0)+1);
        }
        return gd;
    }
}
