package Exercise1.bo;

import java.io.Serializable;

public class Person extends BaseBO {

    // region PARAMETERS

    private int PersonId;
    private String FirstName;
    private String LastName;

    // endregion

    // region CONSTRUCTORS

    public Person() {}

    public Person(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }





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
}
