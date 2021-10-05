package playground;

public class People {
    private String firstName;
    private String lastName;

    public People(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public void setFirstName (String firstname) { this.firstName = firstname; }
    public String getFirstName () { return this.firstName; }

    public void setLastName (String lastname) { this.lastName = lastname; }
    public String getLastName () { return this.lastName; }

}
