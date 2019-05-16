package Exercise1.bo;

public class Movie extends BaseBO {

    // region PARAMETERS

    private int MovieId;

    private String Title;


    // endregion

    // region CONSTRUCTORS

    public Movie() {}


    // endregion

    // region SETTERS / GETTERS

    public int getMovieId() {
        return this.MovieId;
    }

    public void setMovieId(int movieId) {
        this.MovieId = movieId;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }


    // endregion
}
