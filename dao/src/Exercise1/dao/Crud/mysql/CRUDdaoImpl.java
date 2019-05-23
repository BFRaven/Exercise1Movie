package Exercise1.dao.Crud.mysql;

import Exercise1.bo.*;
import Exercise1.dao.Crud.CRUDdao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDdaoImpl extends MySQL implements CRUDdao {

    // region GET/LISTS

    @Override
    public Person getPersonById(int personId) {
        Connect();
        Person person = null;
        try {
            String sp = "{call GetPersonProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, personId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                person = HydratePersonObject(rs);
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return person;
    }

    @Override
    public List<Person> getPersonList() {
        Connect();
        List<Person> personList = new ArrayList<Person>();
        try {
            String sp = "{call GetPersonProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 1);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {

                personList.add(HydratePersonObject(rs));
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return personList;
    }

    @Override
    public Movie getMovieById(int movieId) {
        Connect();
        Movie movie = null;
        try {
            String sp = "{call GetMovieProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, movieId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                movie = HydrateMovieObject(rs);
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return movie;

    }

    @Override
    public List<Movie> getMovieList() {
        Connect();
        List<Movie> movieList = new ArrayList<Movie>();
        try {
            String sp = "{call GetMovieProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 1);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {

                movieList.add(HydrateMovieObject(rs));
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return movieList;
    }

    @Override
    public MovieDetails getMovieDetailsById(int movieDetailsId) {
        return null;
    }

    @Override
    public List<MovieDetails> getMovieDetailsList() {
        return null;
    }

    @Override
    public movieRole getMovieRoleById(int movieRoleId) {
        Connect();
        movieRole movieRole = null;
        try {
            String sp = "{call GetMovieRoleProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, movieRoleId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                movieRole = HydrateMovieRoleObject(rs);
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return movieRole;
    }

    @Override
    public List<movieRole> getMovieRoleList() {
        Connect();
        List<movieRole> movieRoleList = new ArrayList<movieRole>();
        try {
            String sp = "{call GetMovieRoleProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 1);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {


                movieRoleList.add(HydrateMovieRoleObject(rs));
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return movieRoleList;
    }

    @Override
    public ProdCo getProdCoById(int prodCoId) {
        Connect();
        ProdCo prodCo = null;
        try {
            String sp = "{call GetProdCo(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, prodCoId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                prodCo = HydrateProdCoObjects(rs);
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return prodCo;
    }

    @Override
    public List<ProdCo> getProdCoList() {
        Connect();
        List<ProdCo> prodCoList = new ArrayList<ProdCo>();
        try {
            String sp = "{call GetProdCo(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 1);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {


                prodCoList.add(HydrateProdCoObjects(rs));
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return prodCoList;
    }

    @Override
    public ProdMovie getProdMovieById(int prodMovieId) {
        return null;
    }

    @Override
    public List<ProdMovie> getProdMovieList() {
        return null;
    }

    @Override
    public Ratings getRatingsById(int ratingsId) {
        Connect();
        Ratings ratings = null;
        try {
            String sp = "{call GetRatingsProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, ratingsId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                ratings = HydrateRatingsObject(rs);
            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return ratings;
    }

    @Override
    public List<Ratings> getRatingsList() {
        Connect();
        List<Ratings> ratingsList = new ArrayList<Ratings>();
        try {
            String sp = "{call GetRatingsProc(?, ?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 1);
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {

                ratingsList.add(HydrateRatingsObject(rs));

            }

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }
        return ratingsList;
    }


    // endregion


    // region INSERTS

    @Override
    public int insertPerson(Person person) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecPerson(?, ?, ?, ?)}";

            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setString(3, person.getFirstName());
            cStmt.setString(4, person.getLastName());

            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return id;
    }

    @Override
    public int insertMovie(Movie movie) {
        Connect();
        int id = 0;

        try {

            // call ExecMovie(query ID: 10, MovieId, Title);
            String sp = "{call ExecMovie(?, ?, ?)}";

            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setString(3, movie.getTitle());

            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }


        return id;
    }

    @Override
    public int insertMovieDetails(MovieDetails movie) {
        return 0;
    }

    @Override
    public int insertMovieRole(movieRole movieRole) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecMovieRole(?, ?, ?)}";

            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setString(3, movieRole.getMovieRole());

            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return id;
    }

    @Override
    public int insertProdCo(ProdCo prodCo) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecProdCo(?, ?, ?)}";

            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setString(3, prodCo.getCompany());

            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return id;
    }

    @Override
    public int insertProdMovie(ProdMovie prodMovie) {
        return 0;
    }

    @Override
    public int insertRatings(Ratings ratings) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecRatings(?, ?, ?)}";

            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setString(3, ratings.getRating());

            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }


        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return id;
    }

    // endregion


    // region UPDATES


    @Override
    public boolean updatePerson(Person person) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecPerson(?, ?, ?, ?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, UPDATE);  // from INSERT to UPDATE
            cStmt.setInt(2,person.getPersonId());  // from INSERT to UPDATE
            cStmt.setString(3, person.getFirstName());
            cStmt.setString(4, person.getLastName());



            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecMovie(?, ?, ?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, UPDATE);  // from INSERT to UPDATE
            cStmt.setInt(2,movie.getMovieId());  // from INSERT to UPDATE
            cStmt.setString(3, movie.getTitle());


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;

    }

    @Override
    public boolean updateMovieDetails(MovieDetails movieDetails) {
        return false;
    }

    @Override
    public boolean updateMovieRole(movieRole movieRole) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecMovieRole(?, ?, ?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, UPDATE);  // from INSERT to UPDATE
            cStmt.setInt(2,movieRole.getRoleId());  // from INSERT to UPDATE
            cStmt.setString(3, movieRole.getMovieRole());


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean updateProdCo(ProdCo prodCo) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecProdCo(?, ?, ?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, UPDATE);  // from INSERT to UPDATE
            cStmt.setInt(2,prodCo.getProdCoId());  // from INSERT to UPDATE
            cStmt.setString(3, prodCo.getCompany());


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean updateProdMovie(ProdMovie prodMovie) {
        return false;
    }

    @Override
    public boolean updateRatings(Ratings ratings) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecRatings(?, ?, ?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, UPDATE);  // from INSERT to UPDATE
            cStmt.setInt(2,ratings.getRatingsId());  // from INSERT to UPDATE
            cStmt.setString(3, ratings.getRating());


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    // endregion


    // region DELETES

    @Override
    public boolean deletePerson(int personId) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecPerson(?,?,?,?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, DELETE);  // from INSERT to UPDATE
            cStmt.setInt(2,personId);  // from INSERT to UPDATE
            cStmt.setString(3, "");
            cStmt.setString(4, "");



            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean deleteMovie(int movieId) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecMovie(?,?,?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, DELETE);  // from INSERT to UPDATE
            cStmt.setInt(2,movieId);  // from INSERT to UPDATE
            cStmt.setString(3, "");


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean deleteMovieDetails(int movieDetailsId) {
        return false;
    }

    @Override
    public boolean deleteMovieRole(int movieRoleId) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecMovieRole(?,?,?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, DELETE);  // from INSERT to UPDATE
            cStmt.setInt(2,movieRoleId);  // from INSERT to UPDATE
            cStmt.setString(3, "");


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean deleteProdCo(int prodCoId) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecProdCo(?,?,?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, DELETE);  // from INSERT to UPDATE
            cStmt.setInt(2,prodCoId);  // from INSERT to UPDATE
            cStmt.setString(3, "");


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    @Override
    public boolean deleteProdMovie(int prodMovieId) {
        return false;
    }

    @Override
    public boolean deleteRatings(int ratingsId) {
        Connect();
        int id = 0;

        try {
            String sp = "{call ExecRatings(?,?,?)}";

//            this line represents the store procedure that is in mySQL workbench.
            CallableStatement cStmt = connection.prepareCall(sp);

//            the callable statements and parameters needed to insert a new person. Hydrating procedure.
            cStmt.setInt(1, DELETE);  // from INSERT to UPDATE
            cStmt.setInt(2,ratingsId);  // from INSERT to UPDATE
            cStmt.setString(3, "");


            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                id = rs.getInt(1);
            }



        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

        return id > 0;
    }

    // endregion


    // region HYDRATION METHODS

    private static Movie HydrateMovieObject(ResultSet rs) throws SQLException {
        /*

                    movieId          index 1   INT
					title            index 2   VARCHAR


         */
         Movie movie = new Movie();
         movie.setMovieId(rs.getInt(1));
         movie.setTitle(rs.getString(2));

        return movie;
    }

    private static Person HydratePersonObject(ResultSet rs) throws SQLException {
         /*

                    PersonId          index 1   INT
					firstName         index 2   VARCHAR
					lastName          index 3   VARCHAR

                */
        Person person = new Person();
        person.setPersonId(rs.getInt(1));
        person.setFirstName(rs.getString(2));
        person.setLastName(rs.getString(3));

        return person;
    }

    private static movieRole HydrateMovieRoleObject(ResultSet rs) throws SQLException {
                 /*

                    movieRoleId          index 1   INT
					movieRole           index 2   VARCHAR

                */
        movieRole movieRole = new movieRole();
        movieRole.setRoleId(rs.getInt(1));
        movieRole.setMovieRole(rs.getString(2));

        return movieRole;
    }


    private static Ratings HydrateRatingsObject(ResultSet rs) throws SQLException {
         /*

                    ratingsId          index 1   INT
					rating           index 2   VARCHAR


                */
        Ratings ratings = new Ratings();
        ratings.setRatingsId(rs.getInt(1));
        ratings.setRating(rs.getString(2));

        return ratings;
    }

    private static ProdCo HydrateProdCoObjects(ResultSet rs) throws SQLException {
                /*

                    ProdCoId          index 1   INT
					company           index 2   VARCHAR

                */
        ProdCo prodCo = new ProdCo();
        prodCo.setProdCoId(rs.getInt(1));
        prodCo.setCompany(rs.getString(2));

        return prodCo;
    }
    // endregion
}
