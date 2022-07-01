package greeng00se.effectivejava.chapter07.item52;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.assertj.core.api.Assertions.assertThat;

class Item52Test {

    @Test
    @DisplayName("remove() 호출시 Set은 오브젝트 List는 인덱스를 매개변수로 받는다.")
    void _1() {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }

        assertThat(set).containsExactly(-3, -2, -1);
        assertThat(list).containsExactly(-2, 0, 2);
    }

    @Test
    void _2() {
        new Thread(System.out::println).start();

        ExecutorService exec = Executors.newCachedThreadPool();
        // error
        // exec.submit(System.out::println);
    }

}