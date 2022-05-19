package greeng00se.effectivejava.chapter01.item03;

import org.junit.jupiter.api.Test;

class Item03Test {

    @Test
    void enumSingleton() {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.doSomething();
    }

    @Test
    void supplier() {
        UseSupplier useSupplier = new UseSupplier(StaticSingleton::getInstance);
    }

}