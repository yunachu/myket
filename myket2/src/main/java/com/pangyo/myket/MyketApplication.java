package com.pangyo.myket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyketApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyketApplication.class, args);
        System.out.println("Welcome! Myket is started");
    }

}
