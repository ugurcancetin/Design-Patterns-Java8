package cetin.project1.lazyLoadingSingleton;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() { }

    public static DbSingleton getInstance(){
        if(instance == null){
            return new DbSingleton();
        }
        return instance;
    }
}
