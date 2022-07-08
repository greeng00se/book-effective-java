package greeng00se.effectivejava.chapter08.item63;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Item63Test {

    @Test
    @DisplayName("문자열을 + 연산자로 이어주는 건 매우 느리다.")
    void _1() {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "!";
        }
        System.out.println(result);
    }

    @Test
    @DisplayName("StringBuilder를 사용하면 매우 빠르다.")
    void _2() {
        StringBuilder b = new StringBuilder(100000);
        for (int i = 0; i < 100000; i++) {
            b.append("!");
        }
        System.out.println(b);
    }

    @Test
    @DisplayName("출력을 여러번?")
    void _3() {
        for (int i = 0; i < 100000; i++) {
            System.out.print("!");
        }
    }
}
