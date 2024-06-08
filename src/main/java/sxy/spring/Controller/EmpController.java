package sxy.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sxy.spring.Service.EmpService;
import sxy.spring.Service.implment.EmpServiceA;
import sxy.spring.projectclass.Employ;
import sxy.spring.projectclass.Result;
import sxy.spring.utils.XmlParseUtils;

import java.util.List;


@RestController(value = "EmpName")
public class EmpController {

    @Autowired
    private EmpService smpserive;
    @RequestMapping("/emp")
    public Result list(){
        //动态加载类文件
        String file = this.getClass().getClassLoader().getResource("employ.xml").getFile();
//        List<Employ> employs = XmlParseUtils.parse()// 这个方法需要实现xml类 但是这个没写
        return Result.success();
    }
}
