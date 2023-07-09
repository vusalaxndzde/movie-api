package com.vusalaxndzde.movieapi.controller;

import com.vusalaxndzde.movieapi.model.Movie;
import com.vusalaxndzde.movieapi.service.inter.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

}
