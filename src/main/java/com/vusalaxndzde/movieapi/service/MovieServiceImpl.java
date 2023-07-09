package com.vusalaxndzde.movieapi.service;

import com.vusalaxndzde.movieapi.model.Movie;
import com.vusalaxndzde.movieapi.repository.MovieRepository;
import com.vusalaxndzde.movieapi.service.inter.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

}
