package sxy.spring.DAO.implement;

import sxy.spring.DAO.EmployDao;
import sxy.spring.projectclass.Employ;

import java.util.ArrayList;
import java.util.List;

public class EmpAaoA implements EmployDao {

    public List<Employ> listEmp(){

        Employ e1 = new Employ();

        //此接口为了拿到数据
        return new ArrayList<>();
    }

}
