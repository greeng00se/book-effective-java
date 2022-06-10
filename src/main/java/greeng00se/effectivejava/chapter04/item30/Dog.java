package greeng00se.effectivejava.chapter04.item30;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Dog implements Comparable<Dog> {
    private final String name;

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }
}
