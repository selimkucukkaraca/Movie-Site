package services;

import model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> showAllMovies();
    List<Movie> sortByCategory(String categoryName);
    List<Movie> getMovieByRating(int rating,String categoryName);
}