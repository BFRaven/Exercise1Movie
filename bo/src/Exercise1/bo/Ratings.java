package Exercise1.bo;

public class Ratings extends BaseBO {

    // region PARAMETERS

    private int RatingsId;

    private String Rating;

    // endregion

    // region CONSTRUCTORS

    public Ratings() {}

    // endregion

    // region GETTERS / SETTERS

    public int getRatingsId() {
        return this.RatingsId;
    }

    public void setRatingsId(int ratingsId) {
        this.RatingsId = ratingsId;
    }

    public String getRating() {
        return this.Rating;
    }

    public void setRating(String rating) {
        this.Rating = rating;
    }


    // endregion
}
