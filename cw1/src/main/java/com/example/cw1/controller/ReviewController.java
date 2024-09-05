package com.example.cw1.controller;

import com.example.cw1.data.Review;
import com.example.cw1.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping(path = "/reviews")
    public List<Review> getAllReviews()
    {
        return reviewService.getAllReviews();
    }

    @GetMapping(path = "/reviews/{reviewId}")
    public Review findReviewById(@PathVariable int reviewId)
    {
        return reviewService.getReviewById(reviewId);
    }

    @PostMapping(path = "/reviews")
    public Review createReview(@RequestBody Review review)
    {
        return reviewService.createReview(review);
    }

    @PutMapping(path = "/reviews")
    public Review updateReview(@RequestBody Review review)
    {
        return reviewService.updateReview(review);
    }

    @DeleteMapping(path = "/reviews/{reviewId}")
    public Review deleteStudentById(@PathVariable int reviewId)
    {
        return reviewService.deleteStudentBytId(reviewId);
    }
}

