package cetin.project2;

import cetin.project2.EagerSingleton.EagerRegistry;
import cetin.project2.EnumSingleton.RegistryEnum;
import cetin.project2.LazyInitSingleton2.LazyInitRegistry;
import cetin.project2.LazySingleton.LazyRegistry;

public class Main {
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();
        System.out.println(registry == registry1);

        LazyRegistry lazyRegistry = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry == lazyRegistry1);

        LazyInitRegistry r1 = LazyInitRegistry.getInstance();
        LazyInitRegistry r2 = LazyInitRegistry.getInstance();
        System.out.println(r1 == r2);

        RegistryEnum e1 = RegistryEnum.INSTANCE;
        RegistryEnum e2 = RegistryEnum.INSTANCE;
        System.out.println(e1 == e2);
        e1.setValue(1);
        e2.getValue();
        System.out.println(e2.getValue() + " -- " + e1.getValue() );


    }
}
