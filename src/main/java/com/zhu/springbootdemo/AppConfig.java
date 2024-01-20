package com.zhu.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User zhangsan() {
        var user = new User(1, "zhangsan");
        return user;
    }

    @Bean
    public User lisi() {
        var user = new User(1, "lisi");
        return user;
    }
}
