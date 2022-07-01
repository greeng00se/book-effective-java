package greeng00se.effectivejava.chapter07.item53;

import java.util.List;

public class Varargs {

    public static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    public static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min)
                min = arg;
        }
        return min;
    }

    public static void main(String[] args) {
        List.of(1);
    }
}
