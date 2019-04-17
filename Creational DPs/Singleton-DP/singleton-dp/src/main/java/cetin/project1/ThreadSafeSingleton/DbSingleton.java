package cetin.project1.ThreadSafeSingleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create...");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
