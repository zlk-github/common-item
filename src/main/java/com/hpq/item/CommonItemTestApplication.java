package com.hpq.item;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = {"com.hpq"})
@MapperScan(basePackages = {"com.hpq.item.mapper"})
@SpringBootApplication
@EnableSwagger2
public class CommonItemTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonItemTestApplication.class, args);
    }

}
