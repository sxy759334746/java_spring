package sxy.spring.DAO.implement;

import org.springframework.stereotype.Component;
import sxy.spring.DAO.EmployDao;
import sxy.spring.projectclass.Employ;

import java.util.ArrayList;
import java.util.List;

@Component  //加上component注解 表示将当前类交给容器管理 成为ioc容器中的bean
public class EmpDaoA implements EmployDao {

    public List<Employ> listEmp(){

        Employ e1 = new Employ();

        //此接口为了拿到数据
        return new ArrayList<>();
    }

}
