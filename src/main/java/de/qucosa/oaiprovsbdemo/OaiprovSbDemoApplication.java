package de.qucosa.oaiprovsbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class OaiprovSbDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(OaiprovSbDemoApplication.class, args);
    }
}
