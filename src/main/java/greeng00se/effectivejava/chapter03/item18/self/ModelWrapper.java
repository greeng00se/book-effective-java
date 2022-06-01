package greeng00se.effectivejava.chapter03.item18.self;

public class ModelWrapper {
    private final Model model;
    private int changesMade;

    ModelWrapper(Model model) {
        this.model = model;
    }

    // The wrapper is intended to count changes,
    // but those changes which are invoked from
    // Controller are just skipped
    public void makeChange() {
        model.makeChange();
        changesMade++;
    }

    public static void main(String[] args) {
    }
}