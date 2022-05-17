package greeng00se.effectivejava.chapter01.item01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(HelloConfig.class)
public class Item01Test {

    @Test
    void HelloServiceTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloService helloService = ac.getBean(HelloService.class);
        System.out.println(helloService.hello());
    }

}