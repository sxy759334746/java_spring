package sxy.spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sxy.spring.projectclass.Employ;
import sxy.spring.projectclass.Result;
import sxy.spring.utils.XmlParseUtils;

import java.util.List;


@RestController
public class EmpController {
    @RequestMapping("/emp")
    public Result list(){
        //动态加载类文件
        String file = this.getClass().getClassLoader().getResource("employ.xml").getFile();
//        List<Employ> employs = XmlParseUtils.parse()// 这个方法需要实现xml类 但是这个没写
        return Result.success();
    }
}
