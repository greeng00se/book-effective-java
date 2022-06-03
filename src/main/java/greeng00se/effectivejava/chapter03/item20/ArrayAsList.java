package greeng00se.effectivejava.chapter03.item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class ArrayAsList {

    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;
                return oldVal;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
