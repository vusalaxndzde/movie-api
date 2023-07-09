package com.vusalaxndzde.movieapi.service.inter;

import com.vusalaxndzde.movieapi.dto.ReviewDto;
import com.vusalaxndzde.movieapi.model.Review;

public interface ReviewService {

    Review addReview(ReviewDto reviewDto);

}
