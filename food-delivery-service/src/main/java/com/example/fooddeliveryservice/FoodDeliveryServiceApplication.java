package com.example.fooddeliveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodDeliveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodDeliveryServiceApplication.class, args);
    }
}
