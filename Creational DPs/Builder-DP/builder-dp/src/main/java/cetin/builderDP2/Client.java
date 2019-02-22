package cetin.builderDP2;

import cetin.builderDP.Address;
import cetin.builderDP.User;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);

    }

    // Director role in builder pattern. Just doing it via this method
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user){
        return  builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1905, 01, 01));
        user.setFirstName("Ugurcan");
        user.setLastName("Cetin");
        Address address = new Address();
        address.setHouseNumber("13");
        address.setStreet("Sahil Street");
        address.setCity("Mersin");
        address.setState("Turkey");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
