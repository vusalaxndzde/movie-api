package com.vusalaxndzde.movieapi.repository;

import com.vusalaxndzde.movieapi.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


}
