package cetin.project2.EagerSingleton;

public class EagerRegistry {

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry(){}

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }
}
