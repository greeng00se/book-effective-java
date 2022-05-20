package greeng00se.effectivejava.chapter01.item06;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class Item06Test {

    @Test
    void booleanTest() {
        Boolean b = Boolean.valueOf(true);
    }

    @Test
    void roman() {
        for (int i = 0; i < 1000000; i++) {
            Roman.isRomanNumeral("IV");
        }
    }

    @Test
    void romanNumerals() {
        for (int i = 0; i < 1000000; i++) {
            boolean b = RomanNumerals.isRomanNumeral("IV");
        }
    }

    @Test
    void keySetTest() {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("Apple", 5000);
        fruits.put("Orange", 1000);

        Set<String> keySet1 = fruits.keySet();
        Set<String> keySet2 = fruits.keySet();

        keySet1.remove("Orange");
        assertThat(fruits.size()).isEqualTo(1);
        assertThat(keySet2.size()).isEqualTo(1);
    }

    @Test
    void autoBoxingTest() {
        Long sum = 0L;

        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
