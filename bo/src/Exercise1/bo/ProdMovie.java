package Exercise1.bo;

public class ProdMovie extends BaseBO {

    // region PARAMETERS
    // ProdMovieId

    private int ProdMovieId;

    // ProdCo = production company
    private  ProdCo prodCo;


    // endregion


    // region CONSTRUCTORS

    public ProdMovie(ProdCo prodCo) {
        this.prodCo = prodCo;
    }

//    public ProdMovie() {
//        this.prodCo = new ProdCo();
//    }


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
    public ProdCo getProdCo() {
        return this.prodCo;
    }

    public void setProdCo(ProdCo prodCo) {
        this.prodCo = prodCo;
    }

    // endregion



    // endregion
}
