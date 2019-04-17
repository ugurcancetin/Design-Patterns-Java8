package cetin.project2.LazySingleton;

/*

 */
public class LazyRegistry {

    private LazyRegistry(){}

    //for avoiding cached value of the object in a multithreading environment
    private static volatile LazyRegistry INSTANCE;

    public static LazyRegistry getInstance(){
        if(INSTANCE == null){
            synchronized (LazyRegistry.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }
}
