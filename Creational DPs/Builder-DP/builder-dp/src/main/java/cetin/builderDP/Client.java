package cetin.builderDP;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);

        System.out.println(dto.toString());

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){
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
        address.setHouseNumber("12");
        address.setStreet("Sahil Street");
        address.setCity("Mersin");
        address.setState("Turkey");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
