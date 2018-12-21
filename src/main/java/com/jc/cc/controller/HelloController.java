package com.jc.cc.controller;

//@RestController  //支持rest的控制器 它继承自@Controller注解。Controller用来标识当前类是一个控制器servlet
//@EnableAutoConfiguration//高速spring boot根据添加的jar依赖 对spring进行配置
//public class HelloController {
//    @RequestMapping("/") //任何来自"/"路径的HTTP请求应该被映射到home方法
//    String home(){ //以字符串的形式渲染结果  直接返回给调用者
//        return "Hello World!";
//    }
//    public static void main(String[] args) throws  Exception{
//        SpringApplication.run(HelloController.class, args);//将 Example.class作为参数传递给run方法
//    }
//}


import com.jc.cc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController  //返回json格式数据
//@EnableAutoConfiguration//启动方式
////public class HelloController {
////    @RequestMapping("/hello") //任何来自"/"路径的HTTP请求应该被映射到home方法
//    public String hello(){ //以字符串的形式渲染结果  直接返回给调用者
//        return "Hello World!!!";
//    }
//    public static void main(String[] args){
//        SpringApplication.run(HelloController.class, args);
//    }
//}
@RestController  //返回json格式数据
public class HelloController {
    @RequestMapping("/hello") //任何来自"/"路径的HTTP请求应该被映射到home方法
    public String hello(){ //以字符串的形式渲染结果  直接返回给调用者
        return "Hello World!!";
    }
////SSM中异常处理方法
//    @RequestMapping("/excep") //任何来自"/"路径的HTTP请求应该被映射到home方法
//    public String excep(){ //以字符串的形式渲染结果  直接返回给调用者
//        try {
//            int a = 2 / 0;
//        }catch (Exception e){
//            System.out.println("异常");
//        }
//        return "hi world exception~";
//    }
//}

//Spring boot中捕获异常
    @RequestMapping("/excep") //任何来自"/"路径的HTTP请求应该被映射到home方法
    public String excep(){ //以字符串的形式渲染结果  直接返回给调用者
        int a = 2 / 0;
        return "hi world exception~";
    }



    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/getuser")
    public Object getUser(Integer id){
        return  userMapper.getUserById(id);
    }

}