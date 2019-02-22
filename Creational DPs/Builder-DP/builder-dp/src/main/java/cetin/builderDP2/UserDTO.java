package cetin.builderDP2;

import cetin.builderDP.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder{

        private String firstName;
        private String lastName;
        private String age;
        private String address;

        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname){
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname){
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date){
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address){
            this.address = address.getHouseNumber() + ", "  + address.getStreet() + ", "
                    +"\n"+ address.getCity() +"\n"+ address.getState()+"\n"+ address.getZipcode();
            return this;
        }

        public UserDTO build(){
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);
            return this.userDTO;
        }

        public UserDTO getUserDTO(){
            return this.userDTO;
        }
    }
}
