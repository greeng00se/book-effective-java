package greeng00se.effectivejava.chapter11.item85;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Base64;

class Item85Test {

    @Test
    @DisplayName("무한히 계속되는 역직렬화")
    void _1() throws IOException, ClassNotFoundException {
        Bomb bomb = new Bomb();

        // 직렬화된 객체를 담는 변수
        byte[] serializedBomb;

        // 직렬화
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(bomb);

        serializedBomb = baos.toByteArray();
        System.out.println(Base64.getEncoder().encodeToString(serializedBomb));

        // 역직렬화
        ByteArrayInputStream bais = new ByteArrayInputStream(serializedBomb);
        ObjectInputStream ois = new ObjectInputStream(bais);
        ois.readObject();
    }
}