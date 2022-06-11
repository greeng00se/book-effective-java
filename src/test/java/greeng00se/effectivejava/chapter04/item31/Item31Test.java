package greeng00se.effectivejava.chapter04.item31;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Item31Test {

    @Test
    void chooser() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Chooser<Number> chooser = new Chooser<>(integerList);

        ArrayList<B> list = new ArrayList<>();
        list.add(new B(1));
        list.add(new B(5));
        list.add(new B(3));

        ArrayList<A> listA = new ArrayList<>();
        listA.add(new A(3));
        listA.add(new A(1));
        listA.add(new A(5));

        A max = GetMax.max(listA);
    }

}