package greeng00se.effectivejava.chapter01.item07;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class Item07Test {

    @Test
    void weakHashMapTest() {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        map.put(key1, "Orange");
        map.put(key2, "Coffee");

        key1 = null;

        System.gc();

        map.entrySet().stream().forEach(el -> System.out.println(el));
        assertThat(map.size()).isEqualTo(1);
    }
}
