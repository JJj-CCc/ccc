package com.jc.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication//第二种启动方法
@EnableCaching
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}

