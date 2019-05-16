package Exercise1.console;

import Exercise1.bo.MovieDetails;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        /*InstanceOfMovieDetails(); */

        CollectionOfMovieDetls();
    }

    private static void CollectionOfMovieDetls() {

        List<MovieDetails> movieDetailsList = new ArrayList<MovieDetails>();

        MovieDetails movieOne = new MovieDetails();
        movieOne.getPerson().setFirstName("Clint");
        movieOne.getPerson().setLastName("EastWood");
        movieOne.getMovie().setTitle("Gran Torino");
        movieOne.getMovieRole().setMovieRole("Actor/Producer");
        movieOne.getRatings().setRating("R");
        movieOne.getProdMovie().getProdCo().setCompany("Village Roadshow Pictures");

        MovieDetails movieTwo = new MovieDetails();
        movieTwo.getPerson().setFirstName("Michelle");
        movieTwo.getPerson().setLastName("Rodriguez");
        movieTwo.getMovie().setTitle("Resident Evil");
        movieTwo.getMovieRole().setMovieRole("Actor");
        movieTwo.getRatings().setRating("R");
        movieTwo.getProdMovie().getProdCo().setCompany("Constantin Film");


        movieDetailsList.add(movieOne);
        movieDetailsList.add(movieTwo);

        for (MovieDetails m : movieDetailsList) {
            System.out.println(m.getPerson().GetFullName() + " " + m.getMovie().getTitle() + " " + m.getMovieRole().getMovieRole() + " " + m.getRatings().getRating() + " " + m.getProdMovie().getProdCo().getCompany());
        }

    }

    private static void InstanceOfMovieDetails() {
        // instantiating a new object of the MovieDetails class.
    MovieDetails movieDeatailsOne = new MovieDetails();


    movieDeatailsOne.getPerson().setFirstName("Sylvester");
    movieDeatailsOne.getPerson().setLastName("Stallone");
    movieDeatailsOne.getMovie().setTitle("Rocky");
    movieDeatailsOne.getMovieRole().setMovieRole("Actor: Rocky Balboa");
    movieDeatailsOne.getRatings().setRating("PG-13");
    movieDeatailsOne.getProdMovie().getProdCo().setCompany("Chartoff-Winkler Productions");

    System.out.println(movieDeatailsOne.getPerson().GetFullName());
    System.out.println("Movie: " + movieDeatailsOne.getMovie().getTitle());
    System.out.println(movieDeatailsOne.getMovieRole().getMovieRole());
    System.out.println(movieDeatailsOne.getRatings().getRating());
    System.out.println(movieDeatailsOne.getProdMovie().getProdCo().getCompany());

    System.out.println("=======================================================");


        MovieDetails movieDetailsTwo = new MovieDetails();

        movieDetailsTwo.getPerson().setFirstName("Arnold");
        movieDetailsTwo.getPerson().setLastName("Schwarzenegger");
        movieDetailsTwo.getMovie().setTitle("Predator");
        movieDetailsTwo.getMovieRole().setMovieRole("Actor");
        movieDetailsTwo.getRatings().setRating("R");
        movieDetailsTwo.getProdMovie().getProdCo().setCompany("Twentieth Century Fox");

        System.out.println(movieDetailsTwo.getPerson().GetFullName());
        System.out.println(movieDetailsTwo.getMovie().getTitle());
        System.out.println(movieDetailsTwo.getMovieRole().getMovieRole());
        System.out.println(movieDetailsTwo.getRatings().getRating());
        System.out.println(movieDetailsTwo.getProdMovie().getProdCo().getCompany());



    }

}
