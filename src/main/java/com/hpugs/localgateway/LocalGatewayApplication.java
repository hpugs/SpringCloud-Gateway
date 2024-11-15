package com.hpugs.localgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LocalGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalGatewayApplication.class, args);
    }

}
