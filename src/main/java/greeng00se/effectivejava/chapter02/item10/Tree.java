package greeng00se.effectivejava.chapter02.item10;

public class Tree {

    private int age;
    private double height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // null의 경우에도 아래에서 false 반환
        if (!(o instanceof Tree)) return false;

        Tree tree = (Tree) o;

        if (age != tree.age) return false;
        return Double.compare(tree.height, height) == 0;
    }
}
