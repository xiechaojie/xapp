package com.example.servicetest2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTest2Application.class, args);
    }

    @Value("${id}")
    String id;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return id+"--------"+name;
    }
}
