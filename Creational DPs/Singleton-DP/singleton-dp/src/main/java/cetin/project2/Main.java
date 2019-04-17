package cetin.project2;

import cetin.project2.EagerSingleton.EagerRegistry;
import cetin.project2.LazySingleton.LazyRegistry;

public class Main {
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();
        System.out.println(registry == registry1);

        LazyRegistry lazyRegistry = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry == lazyRegistry1);
    }
}
