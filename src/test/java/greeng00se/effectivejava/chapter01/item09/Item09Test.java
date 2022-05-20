package greeng00se.effectivejava.chapter01.item09;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item09Test {

    @Test
    void tryFinallyTest() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
        } finally {
            br.close();
        }
    }
}
