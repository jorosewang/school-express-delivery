package com.delivery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {WebConfig.class, SecurityManager.class})
@ComponentScan("com")
public class Application {
    //lx5548
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}