package greeng00se.effectivejava.chapter05.item37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

class Item37Test {

    private List<Plant> garden;

    @BeforeEach
    void init() {
        garden = new ArrayList<>();
        garden.add(new Plant("one", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("two", Plant.LifeCycle.PERENNIAL));
        garden.add(new Plant("three", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("four", Plant.LifeCycle.BIENNIAL));
        garden.add(new Plant("five", Plant.LifeCycle.PERENNIAL));
    }

    @Test
    void useOrdinal() {
        // 열거값 개수 크기의 배열을 생성
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        // 생명주기 별 HashSet 생성
        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        // 모든 식물을 생명주기별로 구분하여 저장
        for (Plant p : garden) {
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }
    }

    @Test
    void useEnumMap() {
        // EnumMap 생성
        EnumMap<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        // 생명주기 별 HashSet 생성
        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantsByLifeCycle.put(lc, new HashSet<>());
        }

        // 모든 식물을 생명주기별로 구분하여 저장
        for (Plant p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle);
    }

    @Test
    void useStream1() {
        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle)));
    }

    @Test
    void useStream2() {
        EnumMap<Plant.LifeCycle, Set<Plant>> result = garden.stream()
                .collect(groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(Plant.LifeCycle.class), toSet()));

        System.out.println(result);
    }

}