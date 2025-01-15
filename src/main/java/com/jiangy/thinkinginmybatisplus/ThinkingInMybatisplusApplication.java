package com.jiangy.thinkinginmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jiangy.thinkinginmybatisplus.mapper")
@SpringBootApplication
public class ThinkingInMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkingInMybatisplusApplication.class, args);
    }

}
