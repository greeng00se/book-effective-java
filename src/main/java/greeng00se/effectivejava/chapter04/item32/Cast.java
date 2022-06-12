package greeng00se.effectivejava.chapter04.item32;

import java.util.List;

public class Cast {

    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // 힙 오염
        String s = stringLists[0].get(0); // ClassCastException
    }

    public static void main(String[] args) {
        dangerous(List.of("string", "name"), List.of("name"));
    }
}
