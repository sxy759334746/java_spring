package sxy.spring.Service.implment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sxy.spring.DAO.EmployDao;
import sxy.spring.DAO.implement.EmpDaoA;
import sxy.spring.Service.EmpService;
import sxy.spring.projectclass.Employ;

import java.util.List;

@Component
public class EmpServiceA implements EmpService {

    @Autowired //表示运行时ioc会提供该类型的bean对象 并赋值给该变量 依赖注入
    // private EmployDao ed = new EmpDaoA(); 现在就不用new 了
    private EmployDao ed;
    //要使用dao返回的数据来做操作
    @Override
    public List<Employ> listEmp() {
        return null;
    }
}
