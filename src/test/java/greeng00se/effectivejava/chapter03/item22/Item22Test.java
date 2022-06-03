package greeng00se.effectivejava.chapter03.item22;

import org.junit.jupiter.api.Test;

class Item22Test {

    @Test
    void constant() {
        PhysicalConstants boltzmannConstant = PhysicalConstants.BOLTZMANN_CONSTANT;
        double value = boltzmannConstant.getValue();
    }

}