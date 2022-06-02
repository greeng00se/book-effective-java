package greeng00se.effectivejava.chapter03.item23.tag;

public class Figure {
    enum Shape { RECTANGLE, CIRCLE }

    // 태그 필드 - 현재의 모양을 나타낸다.
    final Shape shape;

    // 사각형일 때만 사용된다.
    double length;
    double width;
    
    // 원일 때만 사용된다.
    double radius;

    public Figure(Shape shape) {
        this.shape = shape;
    }
}
