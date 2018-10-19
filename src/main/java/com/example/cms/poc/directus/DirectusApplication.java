package com.example.cms.poc.directus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DirectusApplication {
    public static void main(String[] args) {
        SpringApplication.run(DirectusApplication.class, args);
    }
}
