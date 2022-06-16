package greeng00se.effectivejava.chapter05.item37;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

class Item37Test {

    @Test
    void useOrdinal() {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("one", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("two", Plant.LifeCycle.PERENNIAL));
        garden.add(new Plant("three", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("four", Plant.LifeCycle.BIENNIAL));
        garden.add(new Plant("five", Plant.LifeCycle.PERENNIAL));

        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }
    }

    @Test
    void useEnumMap() {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("one", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("two", Plant.LifeCycle.PERENNIAL));
        garden.add(new Plant("three", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("four", Plant.LifeCycle.BIENNIAL));
        garden.add(new Plant("five", Plant.LifeCycle.PERENNIAL));

        EnumMap<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantsByLifeCycle.put(lc, new HashSet<>());
        }

        for (Plant p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle);
    }

    @Test
    void useStream1() {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("one", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("two", Plant.LifeCycle.PERENNIAL));
        garden.add(new Plant("three", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("four", Plant.LifeCycle.BIENNIAL));
        garden.add(new Plant("five", Plant.LifeCycle.PERENNIAL));

        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle)));

    }

}