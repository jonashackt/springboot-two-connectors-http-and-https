package de.jonashackt.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public static final String RESPONSE = "Hey, Spring Boot User!";
    
    @RequestMapping("/hey")
    public String heySpringBoot() {
        return RESPONSE;
    }
}
