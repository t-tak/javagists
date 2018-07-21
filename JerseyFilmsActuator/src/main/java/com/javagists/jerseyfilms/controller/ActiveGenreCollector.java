package com.javagists.jerseyfilms.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.javagists.jerseyfilms.model.Film;
import com.javagists.jerseyfilms.service.FilmService;
/**
 * 
 * @author javagists.com
 *
 */
@Component
public class ActiveGenreCollector implements HealthIndicator {
	
	@Autowired
	FilmService fs;

	@Override
	public Health health() {
		HashSet<String> activeGenres = new HashSet<String>();
		String status = "None";
		for (Film f : fs.getAllFilms()) {
			activeGenres.add(f.getGenre().toString());
		}
		if(!activeGenres.isEmpty()) {
			status = activeGenres.toString();
		}
		return new Health.Builder().up().withDetail("Active Genres", status).build();
	}

}
