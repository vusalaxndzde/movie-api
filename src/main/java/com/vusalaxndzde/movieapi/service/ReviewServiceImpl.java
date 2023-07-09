package com.vusalaxndzde.movieapi.service;

import com.vusalaxndzde.movieapi.dto.ReviewDto;
import com.vusalaxndzde.movieapi.model.Movie;
import com.vusalaxndzde.movieapi.model.Review;
import com.vusalaxndzde.movieapi.repository.ReviewRepository;
import com.vusalaxndzde.movieapi.service.inter.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    private final MongoTemplate mongoTemplate;

    @Override
    public Review addReview(ReviewDto reviewDto) {
        Review review = reviewRepository.insert(new Review(reviewDto.getReviewBody()));

        mongoTemplate
                .update(Movie.class)
                .matching(Criteria.where("imdbId").is(reviewDto.getImdbId()))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }

}
