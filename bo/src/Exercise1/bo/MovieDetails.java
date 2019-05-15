package Exercise1.bo;
import Exercise1.bo.Person;


public class MovieDetails extends BaseBO {

    // region PARAMETERS

    // MovieDetailsId
    private  int MovieDetailsId;

    // Person
    private Person person;

    // Movie

    private Movie movie;

    // Role

    private movieRole MovieRole;

    // ProdMovie
    private  ProdMovie prodMovie;


    // Ratings
    private Ratings ratings;


//    endregion


    // region CONSTRUCTORS





    // endregion


    // region GETTERS / SETTERS


    // region MOVIEDETAILS
    public void setMovieDetailsId(int movieDetailsId) {
        this.MovieDetailsId = movieDetailsId;
    }

    public int getMovieDetailsId() {
        return this.MovieDetailsId;
    }

    // endregion

    // region MOVIE

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    // endregion

    // region PERSON
    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    // endregion

    // region ROLE

    public movieRole getMovieRole() {
        return MovieRole;
    }

    public void setMovieRole(movieRole movieRole) {
        MovieRole = movieRole;
    }
    // endregion

    // region PRODMOVIE

    public ProdMovie getProdMovie() {
        return this.prodMovie;
    }

    public void setProdMovie(ProdMovie prodMovie) {
        this.prodMovie = prodMovie;
    }


    //endregion

    // region RATINGS

    public Ratings getRatings() {
        return this.ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }


    // endregion


    // endregion


}
