package greeng00se.effectivejava.chapter02.item14;

import lombok.ToString;

import java.util.Comparator;

@ToString
public class Dog implements Comparable<Dog> {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private static final Comparator<Dog> COMPARATOR = Comparator.comparingInt((Dog dog) -> dog.age)
            .thenComparing(dog -> dog.name);

    @Override
    public int compareTo(Dog o) {
        return COMPARATOR.compare(this, o);
    }
}
