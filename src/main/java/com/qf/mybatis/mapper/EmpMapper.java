package com.qf.mybatis.mapper;



import com.qf.mybatis.pojo.Emp;

import java.util.List;


public interface EmpMapper {
    public List<Emp> findEmpList();
    public Emp get(Integer id);
    public void insert(Emp emp);
    public void update(Emp emp);
    public void delete(Integer id);
}
