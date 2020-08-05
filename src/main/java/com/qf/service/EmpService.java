package com.qf.service;


import com.qf.emp.Emp;

import java.util.List;

public interface EmpService {
    public Emp get(Integer id);

    public List<Emp> findEmpList();

    public void insert(Emp emp);

    public void update(Emp emp);

    public void delete(Integer id);
}
