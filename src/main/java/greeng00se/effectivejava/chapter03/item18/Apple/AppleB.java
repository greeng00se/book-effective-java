package greeng00se.effectivejava.chapter03.item18.Apple;

public class AppleB extends AppleA {

    @Override
    public void printAll() {
        super.printAll();
    }

    @Override
    public void print() {
        System.out.println("B");
        super.print();
    }

    public static void main(String[] args) {
        AppleB appleB = new AppleB();
        appleB.printAll();
    }
}
