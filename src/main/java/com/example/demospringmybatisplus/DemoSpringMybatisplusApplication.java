package com.example.demospringmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demospringmybatisplus.mapper")
@SpringBootApplication
public class DemoSpringMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMybatisplusApplication.class, args);
    }

}
