package Exercise1.bo;


import static common.helpers.StringHelper.isNullOfEmpty;

public class Person extends BaseBO {

    // region PARAMETERS

    private int PersonId;
    private String FirstName;
    private String LastName;

    // endregion

    // region CONSTRUCTORS




    // endregion

    // region GETTERS / SETTERS


    public int getPersonId() {
        return this.PersonId;
    }

    public void setPersonId(int personId) {
        this.PersonId = personId;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }



    // endregion

    // region CUSTOM METHODS

    public String GetFullName() {
        if(isNullOfEmpty(this.FirstName) && isNullOfEmpty(this.LastName)) {
            return "No name is set";
        } else {

            if(isNullOfEmpty(this.FirstName))
                return this.LastName;
            else if (isNullOfEmpty(this.LastName))
                return this.FirstName;
            else
                return this.FirstName + " " + this.LastName;

        }

    }



    // endregion
}
