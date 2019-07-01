package com.luxoft.training.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEurekaServer
public class ClientMain {
    public static void main(String[] args) {
        SpringApplication.run(Eureka.class, args);
    }
}