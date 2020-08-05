package com.qf.service;

import com.qf.emp.Emp;
import com.qf.emp.Empmapper;
import com.qf.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    // 自动通过mybatis底层的动态代理生成一个实现了EmpMapper接口的实现类的代理对象
    private SqlSession sqlSession = MyBatisUtils.getSqlSession();
    private Empmapper empMapper = sqlSession.getMapper(Empmapper.class);

    public List<Emp> findEmpList() {
        return empMapper.findEmpList();
    }

    public Emp get(Integer id) {
        return empMapper.get(id);
    }

    public void insert(Emp emp) {
        empMapper.insert(emp);
        sqlSession.commit();
    }

    public void update(Emp emp) {
        empMapper.update(emp);
        sqlSession.commit();
    }

    public void delete(Integer id) {
        empMapper.delete(id);
        sqlSession.commit();
    }
}