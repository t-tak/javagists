package com.javagists.jerseyfilms.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.javagists.jerseyfilms.model.Film;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
/**
 * 
 * @author javagists.com
 *
 */
@Service
public class FilmService {
	private final Map<String, Film> db;
	private Counter adds, mods, deletes;
	
	public FilmService(MeterRegistry registry) {
		this.db = new ConcurrentHashMap<>();
		registry.gaugeMapSize("filmsdb.size", Tags.empty(), this.db);
		this.adds = registry.counter("filmsdb.adds");
		this.mods = registry.counter("filmsdb.mods");
		this.deletes = registry.counter("filmsdb.deletes");
	}
	
	// Get all the films stored in the database
	public Collection<Film> getAllFilms() {
		Collection<Film> all = this.db.values();
		if (all.isEmpty()) {
			return Collections.emptyList();
		} else {
			return all;
		}
	}
	// Add a film to the database
	public void addFilm(Film f) {
		this.adds.increment();
		if(f.getId() == null) {
			f.setId(String.valueOf(this.db.size()+1));
		}
		this.db.put(f.getId(), f);
	}
	// Get a film by id
	public Film getFilm(String id) {
		return this.db.get(id);
	}
	// Modify a film's attributes
	public Film updateFilm(String id, Film f) {
		this.mods.increment();
		if(!this.db.containsKey(id)) {
			throw new IllegalArgumentException("Invalid Film or Film does not exist!");
		}
		if((f.getId() == null) || (id != f.getId())) {
			f.setId(id);
		}
		return this.db.put(id, f);
	}
	// Delete a film from database
	public void removeFilm(String id) {
		this.deletes.increment();
		if(!this.db.containsKey(id)) {
			throw new IllegalArgumentException("Invalid Film or Film does not exist!");
		}
		this.db.remove(id);
	}
}
