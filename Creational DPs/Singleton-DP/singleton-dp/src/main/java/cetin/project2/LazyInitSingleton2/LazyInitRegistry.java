package cetin.project2.LazyInitSingleton2;

//Singleton pattern using lazy initialization holder class. This ensures a lazy init without worrying about synchronization.
public class LazyInitRegistry {

    private LazyInitRegistry(){}

    private static class RegistryHolder{
        static LazyInitRegistry INSTANCE = new LazyInitRegistry();
    }

    public static LazyInitRegistry getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
