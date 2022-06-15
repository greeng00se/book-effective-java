package greeng00se.effectivejava.chapter05.item35;

import org.junit.jupiter.api.Test;

class Item35Test {

    @Test
    void ordinalTest() {
        int result = Ensemble.DUET.ordinal();
        System.out.println(result);
    }

}