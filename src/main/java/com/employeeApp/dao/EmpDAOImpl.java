package com.employeeApp.dao;

import com.employeeApp.entity.Employee;

import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDAOImpl implements EmpDAO{
    private SessionFactory sessionFactory;
    @Autowired
    public EmpDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    @Transactional
    public List<Employee> getAllEmp() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
        return employees;
    }
}
