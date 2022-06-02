package greeng00se.effectivejava.chapter03.item25;

public class Pancake {

    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Dessert.NAME);
    }

    public static class Utensil {
        static final String NAME = "pan";
    }

    public static class Dessert {
        static final String NAME = "cake";
    }
}
