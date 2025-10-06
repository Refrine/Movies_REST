package com.example.movies.service;


import com.example.movies.model.Movie;
import com.example.movies.repo.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepo;

    public MovieService(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
    }


    public List<Movie> allMovies(){
       return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }
}
