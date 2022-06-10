package greeng00se.effectivejava.chapter04.item28;

import org.junit.jupiter.api.Test;

public class Item28Test {

    @Test
    void test() {
        Object[] objectArray = new Integer[5];
        objectArray[0] = "타입이 달라 ArrayStoreException 발생.";

        // List<Object> objectList = new ArrayList<Integer>(); // 컴파일 에러 발생

    }

    @Test
    void genericArray() {
//        List<String>[] stringLists = new List<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects = stringLists;
//        objects[0] = intList;
//        String s = stringLists[0].get(0);
    }
}
