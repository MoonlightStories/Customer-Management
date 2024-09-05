package com.example.cw1.service;

import com.example.cw1.data.Review;
import com.example.cw1.data.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews()
    {
        return reviewRepository.findAll();
    }

    public Review getReviewById(int reviewId)
    {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent())
        {
            return review.get();
        }
        return null;
    }

    public Review createReview(Review review)
    {
        return reviewRepository.save(review);
    }

    public Review updateReview(Review review)
    {
        return reviewRepository.save(review);
    }

    public Review deleteStudentBytId(int reviewId)
    {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent())
        {
            reviewRepository.deleteById(reviewId);
        }
        return null;
    }
}

