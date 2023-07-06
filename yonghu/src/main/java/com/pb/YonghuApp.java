package com.pb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.pb.mapper")
@SpringBootApplication
public class YonghuApp {
    public static void main(String[] args) {
        SpringApplication.run(YonghuApp.class,args);
    }
}
