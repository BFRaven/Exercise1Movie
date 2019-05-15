package Exercise1.bo;

public class ProdMovie extends BaseBO {

    // region PARAMETERS
    // ProdMovieId

    private int ProdMovieId;

    // ProdCo = production company
    private  ProdCo prodCoId;




    // endregion


    // region SETTERS / GETTERS

    // region PRODMOVIE
    public int getProdMovieId() {
        return this.ProdMovieId;
    }

    public void setProdMovieId(int prodMovieId) {
        this.ProdMovieId = prodMovieId;
    }

    // endregion

    // region PRODCO
    public ProdCo getProdCoId() {
        return this.prodCoId;
    }

    public void setProdCoId(ProdCo prodCoId) {
        this.prodCoId = prodCoId;
    }

    // endregion



    // endregion
}
