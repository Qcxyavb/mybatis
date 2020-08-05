package com.qf.emp;

import java.util.List;

public interface Empmapper {
    public List<Emp> findEmpList();
    public Emp get(Integer id);
    public void insert(Emp emp);
    public void update(Emp emp);
    public void delete(Integer id);
}
