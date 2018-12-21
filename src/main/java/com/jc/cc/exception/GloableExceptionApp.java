package com.jc.cc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//捕获异常
@ControllerAdvice//表示要拦截一个异常
public class GloableExceptionApp {
    @ExceptionHandler(RuntimeException.class)//说明捕获的是谁
    @ResponseBody //返回的是哪个
    public String RuntimeException(){
        return "出现异常 捕获全局异常 相当于手写AOP捕获异常";
    }

}
