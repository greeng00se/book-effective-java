package greeng00se.effectivejava.chapter02;

import greeng00se.effectivejava.chapter02.item14.Dog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class Item14Test {

    @Test
    @DisplayName("BigDecimal 클래스는 compareTo 메서드로 수행한 동치성 테스트의 결과가 equals 와 같지 않다.")
    void bigDecimalTest() {
        // given
        BigDecimal bigDecimal1 = new BigDecimal("0.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.00");

        HashSet<BigDecimal> hashSet = new HashSet<>();
        TreeSet<BigDecimal> treeSet = new TreeSet<>();

        // when
        hashSet.add(bigDecimal1);
        hashSet.add(bigDecimal2);

        treeSet.add(bigDecimal1);
        treeSet.add(bigDecimal2);

        boolean compareToResult = bigDecimal1.compareTo(bigDecimal2) == 0;
        boolean equalsResult = bigDecimal1.equals(bigDecimal2);

        // then
        assertThat(compareToResult).isNotEqualTo(equalsResult);
        assertThat(hashSet.size()).isEqualTo(2);
        assertThat(treeSet.size()).isEqualTo(1);
    }

    @Test
    void dog() {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(1, "c"));
        dogList.add(new Dog(1, "a"));
        dogList.add(new Dog(5, "b"));
        dogList.add(new Dog(7, "b"));
        dogList.sort(Dog::compareTo);

        System.out.println(dogList);
    }
}
