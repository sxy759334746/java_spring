package sxy.spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


//这个类里写的路径springboot找不到 可能只能在一个类文件里写controller

@RestController
public class RequestController{
    //原始方式
    @RequestMapping("/simple")
    public String simple(HttpServletRequest request) {
        //获取请求参数
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        System.out.println(name);
        return "ok";
    }
}
