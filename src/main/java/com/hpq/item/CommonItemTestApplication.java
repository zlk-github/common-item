package com.hpq.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = {"com.hpq"})
@SpringBootApplication
@EnableSwagger2
public class CommonItemTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonItemTestApplication.class, args);
    }

}
