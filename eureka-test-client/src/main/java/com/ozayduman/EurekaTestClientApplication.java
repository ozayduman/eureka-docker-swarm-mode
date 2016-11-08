package com.ozayduman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaTestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTestClientApplication.class, args);
    }
}