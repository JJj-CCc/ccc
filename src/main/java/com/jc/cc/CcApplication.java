package com.jc.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling//在指定时间自动执行
@EnableCaching//开启缓存功能
public class CcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcApplication.class, args);
    }

}

