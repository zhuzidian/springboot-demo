package com.zhu.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zhu")
public class Application {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);

//        var names = app.getBeanDefinitionNames();
//        for (var name : names) {
//            System.out.println(name);
//        }
    }

}
