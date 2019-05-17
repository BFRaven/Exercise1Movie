package Exercise1.console;

import Exercise1.bo.*;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

//        InstanceOfMovieDetails();

//        CollectionOfMovieDetls();

//        DbConnection();
//        ExecQuery();

        CollMovieDetls2();
    }

    private static void CollMovieDetls2() {

        MovieDetails fMovie = new MovieDetails();

        Movie m = getMovie();
        Ratings rtng = getRatings();
        Person p = getPerson();

        fMovie.setRatings(rtng);
        fMovie.setMovie(m);
        fMovie.setPerson(p);

        System.out.println("Movie Title: " + fMovie.getMovie().getTitle());
        System.out.println("Rating: " +  fMovie.getRatings().getRating());
        System.out.println("Actor: " + fMovie.getPerson().GetFullName());


        List<ProdMovie> mv = new ArrayList<ProdMovie>();
        mv.add(getProdMovie());
        fMovie.setProdMovie(mv);

        for(ProdMovie pm: fMovie.getProdMovie()) {
            System.out.println("Production Company: " + pm.getProdCo().getCompany());
        }

    }
    // Creating Objects and setting the properties inside them

    private static Movie getMovie() {
        Movie m = new Movie();
        m.setTitle("Resident Evil");
        return m;
    }

    private static Ratings getRatings() {
        Ratings rtng = new Ratings();
        rtng.setRating("R");
        return rtng;
    }

    private static Person getPerson() {
        Person p = new Person();
        p.setFirstName("Michelle");
        p.setLastName("Rodriguez");
        return p;
    }

    private static ProdMovie getProdMovie() {
        ProdCo pc = new ProdCo("Constantin Films");
        ProdMovie pm = new ProdMovie(pc);
        return pm;
    }







    private static void ExecQuery() {
        Connection conn = DbConnection();
        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT firstName, lastName FROM Person;";

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println("FirstName: " + rs.getString(1) + " - LastName: " + rs.getString(2));
            }
            conn.close();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
    }

    private static Connection DbConnection() {

        String dbHost = "localhost";
        String dbName = "movies_db";
        String dbUser = "root";
        String dbPass = "root";


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException ex) {
            System.out.println("My SQL Driver not found! " + ex);
            return null;
        }

        System.out.println("My SQL Driver Registered.");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://"+ dbHost + ":3306/" + dbName + "?useSSL=false",dbUser, dbPass);
        } catch (SQLException ex) {
            System.out.println("Connection failed!" + ex);
            return null;
        }

        if(connection != null) {
            System.out.println("Successfully connected to MySQL DB");
            return connection;
        } else {
            System.out.println("Connection failed!");
            return null;
        }
    }

    private static void CollectionOfMovieDetls() {

       /* List<MovieDetails> movieDetailsList = new ArrayList<MovieDetails>();

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

    } */

   /* private static void InstanceOfMovieDetails() {
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



    } */

    }
}
