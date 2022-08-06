package contol;

import model.Movie;
import services.MovieServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieServiceImpl movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        System.out.println("-----------FILM SITEMIZE HOSGELDINIZ-----------");
        System.out.println(movieService.showAllMovies());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("hangi kategoride film istiyorsunuz ? : ");
        String name = scanner.nextLine();
        System.out.println(movieService.sortByCategory(name));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("imdb puani +kac olan filmler gelsin ? : ");
        int rating = scanner.nextInt();
        System.out.println(movieService.getMovieByRating(rating, name));
    }
}
