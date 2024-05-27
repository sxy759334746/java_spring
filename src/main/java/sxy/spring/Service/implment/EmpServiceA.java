package sxy.spring.Service.implment;

import sxy.spring.DAO.EmployDao;
import sxy.spring.DAO.implement.EmpAaoA;
import sxy.spring.Service.EmpService;
import sxy.spring.projectclass.Employ;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmployDao ed = new EmpAaoA();
    //要使用dao返回的数据来做操作
    @Override
    public List<Employ> listEmp() {
        return null;
    }
}
