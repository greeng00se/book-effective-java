package greeng00se.effectivejava.chapter03.item24;

public class Dog {
    private String name = "doooooG";

    public void bark() {
        class Bark {
            void print() {
                System.out.println(name + ": bow wow");
            }
        }

        Bark bark = new Bark();
        bark.print();
    }
}
