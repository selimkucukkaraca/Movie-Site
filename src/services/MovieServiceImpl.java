package services;

import model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    @Override
    public List<Movie> showAllMovies() {

        Movie movie1 = new Movie(1, "Fight Club", "Drama", 9);
        Movie movie2 = new Movie(2, "Harry Potter", "Science Fiction", 9);
        Movie movie3 = new Movie(3, "The Godfather", "Crime", 8);
        Movie movie4 = new Movie(4, "Terminator", "Action", 7);
        Movie movie5 = new Movie(5, "The Dark Knight", "Adventure", 6);
        Movie movie6 = new Movie(6, "Star Wars", "Science Fiction", 5);
        Movie movie7 = new Movie(7, "The Lord Of The Rings", "Science Fiction", 6);
        Movie movie8 = new Movie(8, "Avengers", "Science Fiction", 8);
        Movie movie9 = new Movie(9, "Mad Max: Fury Road", "Action", 7);
        Movie movie10 = new Movie(10, "Jurassic Park", "Science Fiction", 5);
        Movie movie11 = new Movie(11, "Inception", "Action", 4);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);

        return movies;
    }

    @Override
    public List<Movie> sortByCategory(String categoryName) {
        List<Movie> searchList = new ArrayList<>();
        List<Movie> movies = showAllMovies();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(categoryName)) {
                searchList.add(movie);
            }
        }
        //showAllMovies().stream().filter(movie -> movie.getCategory().equals(name)).collect(Collectors.toList());
        return searchList;
    }

    @Override
    public List<Movie> getMovieByRating(int rating, String categoryName) {
        List<Movie> ratingList = new ArrayList<>();
        List<Movie> movies = sortByCategory(categoryName);
        for (Movie movie : movies) {
            if (movie.getImdb() >= rating) {
                ratingList.add(movie);
            }
        }
        return ratingList;
    }
}
