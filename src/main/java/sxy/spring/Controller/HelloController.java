package sxy.spring.Controller;

//请求处理类

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.SimpleTimeZone;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("hello");
        return "hello";
    }

    //路径参数
    @RequestMapping("/hello/path/{id}")
    public String pathaParam(@PathVariable Integer id){
        System.out.println(id);
        return "ok";
    }

    //路径参数
    @RequestMapping("/hello/path/{id}/{name}")
    public String pathaParam2(@PathVariable Integer id, @PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "ok";
    }

}
