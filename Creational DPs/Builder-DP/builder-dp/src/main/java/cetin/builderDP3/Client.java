package cetin.builderDP3;

public class Client {

    public static void main(String[] args) {

        //After user object has created, it can't be changed as it is immutable
        User user = new User.UserBuilder()
                .withFirstName("Ugurcan")
                .withLastName("Cetin")
                .withAddress("Turkey")
                .build();

        System.out.println(user.toString());
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }
}