package greeng00se.effectivejava.chapter03.item16;

public class FinalCat {

    public final int age;
    public final String name;

    public FinalCat(int age, String name) {
        if (age < 0)
            throw new IllegalArgumentException("age can't be less than zero");
        this.age = age;
        this.name = name;
    }
}
