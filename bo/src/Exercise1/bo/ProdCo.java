package Exercise1.bo;

public class ProdCo extends BaseBO {

    // region PARAMETERS

    private int ProdCoId;

    private String Company;


    // endregion


    // region CONSTRUCTORS

    public ProdCo() {}

    public ProdCo(String company) {
        this.Company  = company;
    }

    // endregion

    // region GETTERS / SETTERS

    public int getProdCoId() {
        return this.ProdCoId;
    }

    public void setProdCoId(int prodCoId) {
        this.ProdCoId = prodCoId;
    }

    public String getCompany() {
        return this.Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }



    // endregion
}
