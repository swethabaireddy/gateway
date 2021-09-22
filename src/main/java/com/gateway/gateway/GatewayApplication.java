package com.gateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GatewayApplication {
   public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
