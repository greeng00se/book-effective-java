package greeng00se.effectivejava.chapter09.item69;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

public class Item69Test {

    @Test
    void _1() {
        List<Integer> list = List.of(1, 2, 3, 4);
        for (Iterator<Integer> i = list.iterator(); i.hasNext(); ) {
            Integer next = i.next();
        }
        throw new NullPointerException();
    }

}
