package com.qf.mybatis.web;


import com.qf.mybatis.pojo.Emp;
import com.qf.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpServlet {

    @Autowired
    private EmpService empService;

    public List<Emp> findEmpList() {
        return empService.findEmpList();
    }

    public Emp get(Integer id) {
        return empService.get(id);
    }

    public void insert(Emp emp) {
        empService.insert(emp);
    }

    public void update(Emp emp) {
        empService.update(emp);
    }

    public void delete(Integer id) {
        empService.delete(id);
    }

    public void trans() {
        Emp chen = get(1210);
        Emp lee = get(1211);
        empService.trans(chen, lee, 1000000.0);
    }
}
