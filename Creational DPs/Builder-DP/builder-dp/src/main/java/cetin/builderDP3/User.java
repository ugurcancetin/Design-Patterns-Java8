package cetin.builderDP3;

//Immutable Object
public class User {

    private final String firstName;
    private final String lastName;
    private final String address;

    private User(final String firstName, final String lastName, final String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder{

        private String nestedFirstName;
        private String nestedLastName;
        private String nestedAdress;

        public UserBuilder withFirstName(String fname){
            this.nestedFirstName = fname;
            return this;
        }

        public UserBuilder withLastName(String lname){
            this.nestedLastName = lname;
            return this;
        }

        public UserBuilder withAddress(String address){
            this.nestedAdress = address;
            return this;
        }

        public User build(){
            return new User(nestedFirstName, nestedLastName, nestedAdress);
        }
    }
}
