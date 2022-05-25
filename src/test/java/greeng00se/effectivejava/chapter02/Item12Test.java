package greeng00se.effectivejava.chapter02;

import org.junit.jupiter.api.Test;

public class Item12Test {

    @Test
    void equalTest() {
        Tree tree1 = new Tree(1, 2);
        Tree tree2 = new Tree(1, 3);

        // Assertions.assertThat(tree1).isEqualTo(tree2);
    }


    public static class Tree {
        int x;
        int y;

        public Tree(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tree)) return false;

            Tree tree = (Tree) o;

            if (x != tree.x) return false;
            return y == tree.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public String toString() {
            return "Tree{" +
                    "x=" + x +
                    '}';
        }
    }
}
