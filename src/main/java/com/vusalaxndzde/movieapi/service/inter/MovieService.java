package com.vusalaxndzde.movieapi.service.inter;

import com.vusalaxndzde.movieapi.model.Movie;
import org.bson.types.ObjectId;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findMovieByImdbId(String imdbId);

}
