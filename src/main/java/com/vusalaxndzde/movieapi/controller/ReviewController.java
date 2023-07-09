package com.vusalaxndzde.movieapi.controller;

import com.vusalaxndzde.movieapi.dto.ReviewDto;
import com.vusalaxndzde.movieapi.model.Review;
import com.vusalaxndzde.movieapi.service.inter.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody ReviewDto reviewDto) {
        return ResponseEntity.status(201).body(reviewService.addReview(reviewDto));
    }

}
