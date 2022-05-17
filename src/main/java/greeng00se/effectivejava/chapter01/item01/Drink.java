package greeng00se.effectivejava.chapter01.item01;

public interface Drink {

    static Drink of(String name) {
        if (name.equals("coffee")) {
            return new Coffee();
        } else {
            return new Juice();
        }
    }

}


