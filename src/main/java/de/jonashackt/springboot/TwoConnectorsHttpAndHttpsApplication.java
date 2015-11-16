package de.jonashackt.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("de.jonashackt.springboot")
public class TwoConnectorsHttpAndHttpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoConnectorsHttpAndHttpsApplication.class, args);
    }
}
