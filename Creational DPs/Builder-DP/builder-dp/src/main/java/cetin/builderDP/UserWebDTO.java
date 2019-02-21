package cetin.builderDP;

public class UserWebDTO implements UserDTO{

    private String name;
    private String address;
    private String age;

    public UserWebDTO(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserWebDTO Object:\n" +
                "name=" + name + '\n' +
                "address='" + address + '\n' +
                "age='" + age ;
    }
}
