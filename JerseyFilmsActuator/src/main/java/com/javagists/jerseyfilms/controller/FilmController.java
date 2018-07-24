package com.javagists.jerseyfilms.controller;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javagists.jerseyfilms.model.Film;
import com.javagists.jerseyfilms.service.FilmService;

@Component
@Path("/films")
public class FilmController {

    @Autowired
    FilmService fs;

    // API End-point to get a list of all films in the database
    @GET
    @Produces("application/json")
    public Collection<Film> films() {
        return fs.getAllFilms();
    }

    // API End-point to get a specific film by id
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Film getFilm(@PathParam("id") String id) {
        return fs.getFilm(id);
    }

    // API End-point to add a new film to database
    @POST
    @Consumes("application/json")
    public Response add(Film film, @Context UriInfo info) {
        fs.addFilm(film);
        return Response.created(URI.create(
                info.getAbsolutePath().toString()+"/"+film.getId()
                )).build();
    }
    //API End-point to modify a film
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Film update(@PathParam("id") String id, Film film) {
        return fs.updateFilm(id, film);
    }
    // API End-point to delete a film
    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        fs.removeFilm(id);
        return Response.ok(id).build();
    }
}

