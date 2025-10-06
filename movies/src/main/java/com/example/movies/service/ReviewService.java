package com.example.movies.service;

import com.example.movies.model.Review;
import com.example.movies.repo.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepo;

    public ReviewService(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }




    public Review createReview(String reviewBody, String imdbId){
        Review review = new Review(reviewBody);

       return reviewRepo.save(review);


    }
}
