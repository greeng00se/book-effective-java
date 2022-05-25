package greeng00se.effectivejava.chapter02.item10;

public class Tree {

    private int age;
    private double height;

    @Override
    public boolean equals(Object o) {

        // 1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
        if (this == o) return true;

        // 2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
        if (!(o instanceof Tree)) return false;

        // 3. 입력을 올바른 타입으로 형변환 한다.
        Tree tree = (Tree) o;

        // 4. 입력 객체와 자기 자신의 대응되는 핵심 필드들이 모두 일치하는지 검사한다.
        if (age != tree.age) return false;
        return Double.compare(tree.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
