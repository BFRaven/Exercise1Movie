package Exercise1.dao.Crud;

import Exercise1.bo.*;

import java.util.List;

public interface CRUDdao {

    // region GET METHODS

    public Person getPersonById(int personId);

    public List<Person> getPersonList();

    public Movie getMovieById(int movieId);

    public List<Movie> getMovieList();

    public MovieDetails getMovieDetailsById(int movieDetailsId);

    public List<MovieDetails> getMovieDetailsList();

    public movieRole getMovieRoleById(int movieRoleId);

    public List<movieRole> getMovieRoleList();

    public ProdCo getProdCoById(int prodCoId);

    public List<ProdCo> getProdCoList();

    public ProdMovie getProdMovieById(int prodMovieId);

    public List<ProdMovie> getProdMovieList();

    public Ratings getRatingsById(int ratingsId);

    public List<Ratings> getRatingsList();




    // endregion


    // region INSERT METHODS

    // accepts a class object and return an ID of the newly created class instance.

    public int insertPerson(Person person);

    public int insertMovie(Movie movie);

    public int insertMovieDetails(MovieDetails movie);

    public int insertMovieRole(movieRole movieRole);

    public int insertProdCo(ProdCo prodCo);

    public int insertProdMovie(ProdMovie prodMovie);

    public int insertRatings(Ratings ratings);

    // endregion


    // region UPDATE METHODS

    // going to return true or false if the operation was successful in adding an instance of that class object

    public boolean updatePerson(Person person);

    public boolean updateMovie(Movie movie);

    public boolean updateMovieDetails(MovieDetails movieDetails);

    public boolean updateMovieRole(movieRole movieRole);

    public boolean updateProdCo(ProdCo prodCo);

    public boolean updateProdMovie(ProdMovie prodMovie);

    public boolean updateRatings(Ratings ratings);

    // endregion


    // region DELETE METHODS

    // deletes instance of class object by ID

    public boolean deletePerson(int personId);

    public boolean deleteMovie(int movieId);

    public boolean deleteMovieDetails(int movieDetailsId);

    public boolean deleteMovieRole(int movieRoleId);

    public boolean deleteProdCo(int prodCoId);

    public boolean deleteProdMovie(int prodMovieId);

    public boolean deleteRatings(int ratingsId);


    // endregion
}
