package greeng00se.effectivejava.chapter01.item03;

import org.junit.jupiter.api.Test;

class Item03Test {

    @Test
    void singleton() {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("국수");
        System.out.println(instance.getName());
    }

    @Test
    void supplier() {
        UseSupplier useSupplier = new UseSupplier(StaticSingleton::getInstance);
    }

}