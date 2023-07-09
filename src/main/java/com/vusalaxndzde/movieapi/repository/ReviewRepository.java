package com.vusalaxndzde.movieapi.repository;

import com.vusalaxndzde.movieapi.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {


}
