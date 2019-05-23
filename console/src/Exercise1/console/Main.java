package Exercise1.console;

import Exercise1.bo.*;
import Exercise1.dao.Crud.CRUDdao;
import Exercise1.dao.Crud.mysql.CRUDdaoImpl;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


import java.awt.image.VolatileImage;
import java.net.CookieHandler;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//        InstanceOfMovieDetails();

//        CollectionOfMovieDetls();

//          DbConnection();

//          GetStoredProc();

//        ExecQuery();

//        CollMovieDetls2();

//          DAOMethods();

//        InsertMethods();

//          UpdateMethods();

        DeleteMethods();
    }

    private static void DeleteMethods() {
//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        if(cruDdao.deleteMovie(4)) {
//            System.out.println("Movie Deleted Successfully.");
//        } else {
//            System.out.println("Title Failed to Delete");
//        }

//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        if(cruDdao.deletePerson(6)) {
//            System.out.println("Person Deleted Successfully.");
//        } else {
//            System.out.println("Person Failed to Delete");
//        }


//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        if(cruDdao.deleteMovieRole(4)) {
//            System.out.println("Role Deleted Successfully.");
//        } else {
//            System.out.println("Role Failed to Delete");
//        }

//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        if(cruDdao.deleteProdCo(5)) {
//            System.out.println("Company Deleted Successfully.");
//        } else {
//            System.out.println("Company Failed to Delete");
//        }

        CRUDdao cruDdao = new CRUDdaoImpl();

        if(cruDdao.deleteRatings(4)) {
            System.out.println("Rating Deleted Successfully.");
        } else {
            System.out.println("Rating Failed to Delete");
        }

    }

    private static void UpdateMethods() {
//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        Movie movie = cruDdao.getMovieById(4);
//        movie.setTitle("Ironman 2");
//
//        if (cruDdao.updateMovie(movie)) {
//
//            System.out.println("Movie Title Updated Successfully");
//        } else {
//            System.out.println("Title failed to update");
//        }

//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        Person person = cruDdao.getPersonById(6);
//        person.setFirstName("Gwyneth");
//        person.setLastName("Paltrow");
//
//
//        if (cruDdao.updatePerson(person)) {
//
//            System.out.println("Person Updated Successfully");
//        } else {
//            System.out.println("Person failed to update");
//        }



//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        movieRole movieRole = cruDdao.getMovieRoleById(4);
//        movieRole.setMovieRole("Actress");
//
//        if (cruDdao.updateMovieRole(movieRole)) {
//
//            System.out.println("Movie Role Updated Successfully");
//        } else {
//            System.out.println("Role failed to update");
//        }


//        CRUDdao cruDdao = new CRUDdaoImpl();
//
//        ProdCo prodCo = cruDdao.getProdCoById(5);
//        prodCo.setCompany("Paramount Pictures");
//
//        if (cruDdao.updateProdCo(prodCo)) {
//
//            System.out.println("Company Updated Successfully");
//        } else {
//            System.out.println("Company failed to update");
//        }

        CRUDdao cruDdao = new CRUDdaoImpl();

        Ratings ratings = cruDdao.getRatingsById(4);
        ratings.setRating("General");

        if (cruDdao.updateRatings(ratings)) {

            System.out.println("Ratings Updated Successfully");
        } else {
            System.out.println("Ratings failed to update");
        }
    }

    private static void InsertMethods() {

//        Movie movie = new Movie();
//        movie.setTitle("Ironman");
//
//        CRUDdao cruDdao = new CRUDdaoImpl();
//        int id = cruDdao.insertMovie(movie);
//
//        System.out.println("New Movie Title Inserted. ID = " + id);

//        Person person = new Person();
//        person.setFirstName("Robert");
//        person.setLastName("Downey Jr.");
//
//        CRUDdao cruDdaoPer = new CRUDdaoImpl();
//        int idPer = cruDdaoPer.insertPerson(person);
//
//        System.out.println("New Person Inserted. ID = " + idPer);


//        movieRole movieRole = new movieRole();
//        // this was added to test delete method later; no need for duplication.
//        movieRole.setMovieRole("Actor");
//
//        CRUDdao cruDdaoPer = new CRUDdaoImpl();
//        int idRole = cruDdaoPer.insertMovieRole(movieRole);
//
//        System.out.println("New Role Inserted. ID = " + idRole);

//        ProdCo prodCo = new ProdCo();
//        // this was added to test delete method later; no need for duplication.
//        prodCo.setCompany("Marvel Studios");
//
//        CRUDdao cruDdaoPer = new CRUDdaoImpl();
//        int idCo = cruDdaoPer.insertProdCo(prodCo);
//
//        System.out.println("New Production Company Inserted. ID = " + idCo);


        Ratings ratings = new Ratings();
        // this was added to test delete method later; no need for duplication.
        ratings.setRating("G");

        CRUDdao cruDdaoPer = new CRUDdaoImpl();
        int idRating = cruDdaoPer.insertRatings(ratings);

        System.out.println("New Rating Inserted. ID = " + idRating);
    }

    private static void DAOMethods() {

        // region CREATE MENU
        CRUDdao crudDao = new CRUDdaoImpl(); // fix next time;

        // insert the desired lists of the CRUDdao interfaces that you want
        List<Movie> movieList = crudDao.getMovieList();
        List<Ratings> ratingsList = crudDao.getRatingsList();
        List<Person> personList = crudDao.getPersonList();
        List<movieRole> movieRoleList = crudDao.getMovieRoleList();
        List<ProdCo> prodCoList = crudDao.getProdCoList();

        // print out results
        System.out.println("==============================");
        for(Movie movie : movieList) {
            System.out.println(movie.getMovieId() + ") " + movie.getTitle());
        }
        System.out.println("==============================");
        for(Ratings ratings : ratingsList) {
            System.out.println(ratings.getRatingsId() + ") " + ratings.getRating());
        }
        System.out.println("==============================");
        for(Person person : personList) {
            System.out.println(person.getPersonId() + ") " + person.GetFullName());
        }
        System.out.println("==============================");
        for(movieRole movieRole : movieRoleList) {
            System.out.println(movieRole.getRoleId() + ") " + movieRole.getMovieRole());
        }
        System.out.println("==============================");
        for(ProdCo prodCo : prodCoList) {
            System.out.println(prodCo.getProdCoId() + ") " + prodCo.getCompany());
        }


        // endregion


        // region PROMPT USER
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Select a Movie from list: ");
        String movieId = reader.nextLine();
        System.out.println("Please Select a Rating from list: ");
        String ratingsId = reader.nextLine();
        System.out.println("Please Select a Person from list: ");
        String personId = reader.nextLine();
        System.out.println("Please Select a Role from list: ");
        String roleId = reader.nextLine();
        System.out.println("Please Select a Production Company from list: ");
        String prodCoId = reader.nextLine();

        // endregion


        // region GET DETAILS

        Movie movieDets = crudDao.getMovieById(Integer.parseInt(movieId));
        Ratings ratingsDets = crudDao.getRatingsById(Integer.parseInt(ratingsId));
        Person personDets = crudDao.getPersonById(Integer.parseInt(personId));
        movieRole roleDets = crudDao.getMovieRoleById(Integer.parseInt(roleId));
        ProdCo companyDets = crudDao.getProdCoById(Integer.parseInt(prodCoId));

        System.out.println("--------- DETAILS ----------");
        System.out.println("Person : " + personDets.GetFullName());

        System.out.println("Movie Title: " + movieDets.getTitle());
        System.out.println("Movie Rating : " + ratingsDets.getRating());
        System.out.println("Role of Person in Movie: " + roleDets.getMovieRole());
        System.out.println("Production Company: " + companyDets.getCompany());

        // endregion

    }


    private static void GetStoredProc() {
        Connection conn = DbConnection();
        try {
            String sp = "{call GetPersonProc(?, ?)}";
            CallableStatement cStmt = conn.prepareCall(sp);
            cStmt.setInt(1, 20);
            cStmt.setInt(2,0);
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {
                /*

                    PersonId          index 1   INT
					firstName         index 2   VARCHAR
					lastName          index 3   VARCHAR

                */
                System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(3));
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }

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
            String sql = "SELECT PersonId, firstName, lastName FROM Person;";

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int personId = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);

                System.out.println("Person ID: " + personId + " - FirstName: " + firstName + " - LastName: " + lastName);
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
        String useSSL = "false";
        // This parameter allows us run stored procedures, added to the connection query.
        String procBod = "true";


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException ex) {
            System.out.println("My SQL Driver not found! " + ex);
            return null;
        }

        System.out.println("My SQL Driver Registered.");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://"+ dbHost + ":3306/" + dbName + "?useSSL=" + useSSL + "&noAccessToProcedureBodies=" + procBod,dbUser, dbPass);
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
