package com.pb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.pb.mapper")
public class PageApp {
    public static void main(String[] args) {
        SpringApplication.run(PageApp.class, args);
    }
}
