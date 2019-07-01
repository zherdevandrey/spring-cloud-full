package com.luxoft.training.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountService {
    public static void main(String[] args) {
        SpringApplication.run(AccountService.class, args);
    }
}