package greeng00se.effectivejava.chapter03.item18.self;

// basic class which we will wrap
public class Model {
    Controller controller;

    Model(Controller controller){
        this.controller = controller;
        controller.register(this); // Pass SELF reference
    }

    public void makeChange(){
        System.out.println("change");
    }
}

