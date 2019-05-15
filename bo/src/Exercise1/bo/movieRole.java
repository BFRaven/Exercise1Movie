package Exercise1.bo;

public class movieRole extends BaseBO {

    // region PARAMETERS

    private int RoleId;

    private String MovieRole;




    // endregion


    // region GETTERS / SETTERS

    public int getRoleId() {
        return this.RoleId;
    }

    public void setRoleId(int roleId) {
        this.RoleId = roleId;
    }

    public String getMovieRole() {
        return this.MovieRole;
    }

    public void setMovieRole(String movieRole) {
        this.MovieRole = movieRole;
    }


    // endregion
}
