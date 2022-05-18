package greeng00se.effectivejava.chapter01.item02;

import org.junit.jupiter.api.Test;

import static greeng00se.effectivejava.chapter01.item02.NyPizza.Size.SMALL;
import static greeng00se.effectivejava.chapter01.item02.Pizza.Topping.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Item02Test {

    @Test
    void useBuilderPattern() {
        BuilderCoffee coffee = new BuilderCoffee.Builder(100)
                .iced(true)
                .water(200)
                .build();

        assertThat(coffee.getSize()).isEqualTo(100);
        assertThat(coffee.isIced()).isTrue();
        assertThat(coffee.getWater()).isEqualTo(200);
    }

    @Test
    void pizzaBuilder() {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
