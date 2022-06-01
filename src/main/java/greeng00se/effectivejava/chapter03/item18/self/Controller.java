package greeng00se.effectivejava.chapter03.item18.self;

public class Controller {
    private Model model;

    public void register(Model model){
        this.model = model;
    }

    // Here the wrapper just fails to count changes,
    // because it does not know about the wrapped object
    // references leaked
    public void doChanges() {
        model.makeChange();
    }
}
