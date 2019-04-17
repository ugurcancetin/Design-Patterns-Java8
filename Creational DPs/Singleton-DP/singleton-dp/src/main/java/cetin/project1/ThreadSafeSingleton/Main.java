package cetin.project1.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
