package greeng00se.effectivejava.chapter06.item43;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GoshThisClassNameIsHumongous {

    private static final ExecutorService service = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        service.execute(GoshThisClassNameIsHumongous::action);
        service.execute(() -> action());
        service.shutdown();
    }

    private static void action() {
        System.out.println("GOSH THIS CLASS NAME IS HUMONGOUS!");
    }
}
