package greeng00se.effectivejava.chapter04.item31;

public class A implements Comparable<A> {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(A o) {
        return n - o.n;
    }
}
