package greeng00se.effectivejava.chapter01.item08;

import org.junit.jupiter.api.Test;

public class Item08Test {

    @Test
    void clean1() throws Exception {
        try (Room room = new Room()) {
            System.out.println("안녕");
        }
    }

    @Test
    void clean2() {
        Room room = new Room();
        System.out.println("안녕");
    }
}
