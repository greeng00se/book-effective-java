package greeng00se.effectivejava.chapter01.item01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService() {
        return new KoreanHelloService();
    }
}
