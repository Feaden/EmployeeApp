package com.employeeApp.dao;

import com.employeeApp.entity.Employee;

import java.util.List;

public interface EmpDAO {
    public List<Employee> getAllEmp();
    public void saveEmp(Employee employee);
    public Employee getEmp(int id);
}
