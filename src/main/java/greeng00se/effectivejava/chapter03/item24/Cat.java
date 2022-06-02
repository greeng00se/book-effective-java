package greeng00se.effectivejava.chapter03.item24;

public class Cat {

    private String name = "tom";

    public class Nested {
        public void print() {
            // 정규화된 this
            System.out.println("Cat name: " + Cat.this.name);
        }
    }
}
