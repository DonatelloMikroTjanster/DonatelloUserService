package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.Rating;
import com.nadia.donatellouserservice.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Rating getRatingById(Long id) {
        return ratingRepository.findById(id).orElse(null);
    }

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public Rating updateRating(Long id, Rating updatedRating) {
        return ratingRepository.findById(id).map(rating -> {
            rating.setRating(updatedRating.getRating());
            rating.setUser(updatedRating.getUser());
            rating.setMedia(updatedRating.getMedia());
            return ratingRepository.save(rating);
        }).orElse(null);
    }

    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }


}
