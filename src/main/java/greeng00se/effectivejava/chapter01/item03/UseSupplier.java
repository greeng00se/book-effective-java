package greeng00se.effectivejava.chapter01.item03;

import java.util.function.Supplier;

public class UseSupplier {

    private final Supplier<? extends StaticSingleton> singleton;

    public UseSupplier(Supplier<? extends StaticSingleton> singleton) {
        this.singleton = singleton;
    }
}
