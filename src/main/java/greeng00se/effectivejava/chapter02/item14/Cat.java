package greeng00se.effectivejava.chapter02.item14;

public class Cat implements Comparable<Cat> {

    private String name;

    @Override
    public int compareTo(Cat o) {
        return name.compareTo(o.name);
    }
}
